package com.example.arknightsserve.service;

import com.example.arknightsserve.pojo.loginPojo.LoginRequest;
import com.example.arknightsserve.pojo.loginPojo.LoginResponse;
import com.example.arknightsserve.pojo.signupPojo.SignupRequest;
import com.example.arknightsserve.pojo.signupPojo.SignupResponse;


public interface UserService {
    LoginResponse pwdLogin(LoginRequest req);
    SignupResponse pwdSignup(SignupRequest req);

}