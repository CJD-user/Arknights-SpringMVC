package com.example.arknightsserve.dao;

import com.example.arknightsserve.entity.UserMainOperator;
import org.apache.ibatis.annotations.Param;

public interface UserMainOperatorDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMainOperator record);

    int insertSelective(UserMainOperator record);

    UserMainOperator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMainOperator record);

    int updateByPrimaryKey(UserMainOperator record);

    int updateMain(@Param("userId") Integer userId,@Param("operatorId") Integer operatorId);
}