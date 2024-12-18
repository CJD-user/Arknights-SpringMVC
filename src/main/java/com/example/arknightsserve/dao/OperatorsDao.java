package com.example.arknightsserve.dao;

import com.example.arknightsserve.entity.Operators;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperatorsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Operators record);

    int insertSelective(Operators record);

    Operators selectByUid(@Param("id")Integer id);

    Operators selectByType(Integer type);

    List<Operators> selectAllByType(@Param("type")Integer type);

    List<Operators> selectAllOwned(@Param("id")Integer id);

    int updateByPrimaryKeySelective(Operators record);

    int updateByPrimaryKey(Operators record);
}