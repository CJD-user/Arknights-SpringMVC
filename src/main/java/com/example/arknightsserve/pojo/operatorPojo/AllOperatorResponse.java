package com.example.arknightsserve.pojo.operatorPojo;

import com.example.arknightsserve.entity.Operators;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class AllOperatorResponse {
    private List<Operators> operatorsList;
}
