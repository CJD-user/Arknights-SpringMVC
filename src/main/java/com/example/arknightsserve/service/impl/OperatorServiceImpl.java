package com.example.arknightsserve.service.impl;

import com.example.arknightsserve.dao.OperatorsDao;
import com.example.arknightsserve.dao.UserDao;
import com.example.arknightsserve.dao.UserMainOperatorDao;
import com.example.arknightsserve.entity.Operators;
import com.example.arknightsserve.entity.User;
import com.example.arknightsserve.pojo.operatorPojo.AllOperatorResponse;
import com.example.arknightsserve.pojo.operatorPojo.ChangeOperatorStatus;
import com.example.arknightsserve.pojo.operatorPojo.OperatorRequest;
import com.example.arknightsserve.pojo.operatorPojo.OperatorResponse;
import com.example.arknightsserve.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorServiceImpl implements OperatorService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private OperatorsDao operatorsDao;

    @Autowired
    private UserMainOperatorDao userMainOperatorDao;

    @Override
    public OperatorResponse showOperators(Integer id) {
        Operators operators = operatorsDao.selectByUid(id);
        return new OperatorResponse(operators);
    }

    @Override
    public AllOperatorResponse getAllType(Integer type) {
        List<Operators> operatorsList = operatorsDao.selectAllByType(type);
        return new AllOperatorResponse(operatorsList);
    }

    @Override
    public AllOperatorResponse getAllOwned(Integer id) {
        List<Operators> operatorsList = operatorsDao.selectAllOwned(id);
        return  new AllOperatorResponse(operatorsList);
    }

    @Override
    public ChangeOperatorStatus UpdateMain(OperatorRequest req) {
        int userId = req.getUserId();
        int operatorId = req.getOperatorId();

        // 验证用户是否存在
        User user = userDao.findById(userId);
        if (user == null) {
            return new ChangeOperatorStatus(0, "用户不存在!");
        }

        // 验证干员是否存在
        Operators operator = operatorsDao.findById(operatorId);
        if (operator == null) {
            return new ChangeOperatorStatus(0, "干员不存在!");
        }

        // 查询用户和干员的关系
        int result = userMainOperatorDao.updateMain(userId, operatorId);
        if (result > 0) {
            // 成功，返回 1
            return new ChangeOperatorStatus(1,"更新成功!");
        } else {
            // 失败，返回 0
            return new ChangeOperatorStatus(0,"更新失败!");
        }
    }
}
