package com.example.arknightsserve.dao;

import com.example.arknightsserve.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByPwd(@Param("account") String account,@Param("password") String password);
    User findByAccount(@Param("account") String account);
    int insertByPwd(User user);
}