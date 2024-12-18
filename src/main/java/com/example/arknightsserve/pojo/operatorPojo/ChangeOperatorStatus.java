package com.example.arknightsserve.pojo.operatorPojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ChangeOperatorStatus {
    private Integer status;
    private String message;
}
