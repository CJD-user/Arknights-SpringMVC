package com.example.arknightsserve.pojo.loginPojo;

import com.example.arknightsserve.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginResponse {
    private User user;
}