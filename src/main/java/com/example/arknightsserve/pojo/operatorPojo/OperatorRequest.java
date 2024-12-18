package com.example.arknightsserve.pojo.operatorPojo;

import com.example.arknightsserve.entity.Operators;
import com.example.arknightsserve.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OperatorRequest {
    private User user;
    private Operators operators;
}
