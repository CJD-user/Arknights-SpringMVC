package com.example.arknightsserve.pojo.operatorPojo;

import com.example.arknightsserve.entity.Operators;
import com.example.arknightsserve.entity.User;
import com.example.arknightsserve.entity.UserMainOperator;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OperatorRequest {
    private UserMainOperator userMainOperator;
}
