package com.example.arknightsserve.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BadResponse {
    private Integer status;
    private String message;
}
