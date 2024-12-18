package com.example.arknightsserve.controller;

import com.example.arknightsserve.pojo.loginPojo.LoginRequest;
import com.example.arknightsserve.pojo.operatorPojo.OperatorRequest;
import com.example.arknightsserve.service.OperatorService;
import com.example.arknightsserve.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/operator")
public class OperatorController {

    @Autowired
    private OperatorService operatorService;

    @GetMapping ("/show/{id}")
    public JsonData showOperators( @PathVariable Integer id){
        System.out.println(id+"号用户发起主页展示干员资源的请求！");
        return JsonData.buildSuccess(operatorService.showOperators(id));
    }
    @GetMapping ("/get/{type}")
    public JsonData getAllType(@PathVariable Integer type){
        System.out.println("发起"+type+"星干员资源的请求！");
        return JsonData.buildSuccess(operatorService.getAllType(type));
    }

    @GetMapping ("/getAll/{id}")
    public JsonData getAllOwned(@PathVariable Integer id){
        System.out.println(id+"号用户发起所有已拥有干员资源的请求！");
        return JsonData.buildSuccess(operatorService.getAllOwned(id));
    }
    @PutMapping("/changeMain")
    @ResponseBody
    public JsonData UpdateMain( OperatorRequest req){
        System.out.println(req.getUser().getId()+"号用户发起主页干员资源的更换！");
        return JsonData.buildSuccess(operatorService.UpdateMain(req));
    }

}