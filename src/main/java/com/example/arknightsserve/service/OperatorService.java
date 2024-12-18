package com.example.arknightsserve.service;

import com.example.arknightsserve.entity.Operators;
import com.example.arknightsserve.pojo.operatorPojo.AllOperatorResponse;
import com.example.arknightsserve.pojo.operatorPojo.OperatorRequest;
import com.example.arknightsserve.pojo.operatorPojo.OperatorResponse;

import java.util.List;

public interface OperatorService {
    OperatorResponse showOperators(Integer id);

    AllOperatorResponse getAllType(Integer type);

    AllOperatorResponse getAllOwned(Integer id);

    int UpdateMain(OperatorRequest req);
}
