package com.example.arknightsserve.controller;

import com.example.arknightsserve.pojo.loginPojo.LoginRequest;
import com.example.arknightsserve.pojo.signupPojo.SignupRequest;
import com.example.arknightsserve.service.UserService;
import com.example.arknightsserve.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public JsonData pwdLogin(@RequestBody LoginRequest req){
        System.out.println("登录信息"+req.toString());
        return JsonData.buildSuccess(userService.pwdLogin(req));
    }

    @PostMapping("/signup")
    @ResponseBody
    public JsonData pwdSignup(@RequestBody SignupRequest req){
        System.out.println("注册信息"+req.toString());
        return JsonData.buildSuccess(userService.pwdSignup(req));
    }


}