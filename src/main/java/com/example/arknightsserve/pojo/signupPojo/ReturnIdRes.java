package com.example.arknightsserve.pojo.signupPojo;

import lombok.Data;

@Data
public class ReturnIdRes {
    private Integer id;

    public ReturnIdRes(Integer id) {
        this.id = id;
    }
}
