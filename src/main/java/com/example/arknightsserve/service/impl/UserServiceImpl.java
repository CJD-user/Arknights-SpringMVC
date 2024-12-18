package com.example.arknightsserve.service.impl;

import com.example.arknightsserve.dao.UserDao;
import com.example.arknightsserve.entity.User;
import com.example.arknightsserve.pojo.loginPojo.LoginRequest;
import com.example.arknightsserve.pojo.loginPojo.LoginResponse;
import com.example.arknightsserve.pojo.signupPojo.SignupRequest;
import com.example.arknightsserve.pojo.signupPojo.SignupResponse;
import com.example.arknightsserve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public LoginResponse pwdLogin(LoginRequest req) {
        User user = userDao.findByPwd(req.getAccount(), req.getPassword());
        return new LoginResponse(user);
    }

    @Override
    public SignupResponse pwdSignup(SignupRequest req) {
        // 先检查账号是否存在
        User existingUser = userDao.findByAccount(req.getAccount());
        if (existingUser != null) {
            // 账号已存在，返回注册失败
            return new SignupResponse(0);  // 返回一定的错误代码，例如 0 代表失败
        }

        // 创建新用户对象，并设置必要字段
        User newUser = new User();
        newUser.setAccount(req.getAccount());
        newUser.setPassword(req.getPassword());

        // 设置默认值
        newUser.setArkname("博士");
        newUser.setArkid("1111111");
        newUser.setArklv(1);
        newUser.setArkvoice("博士,欢迎回来!");
        newUser.setArklongmenbi(9999);
        newUser.setArkhechengyu(9999);
        newUser.setArkyuanshi(9999);

        // 插入用户
        int result = userDao.insertByPwd(newUser);
        if (result > 0) {
            // 注册成功，返回 1
            return new SignupResponse(1);
        } else {
            // 插入失败，返回 0
            return new SignupResponse(0);
        }
    }

}
