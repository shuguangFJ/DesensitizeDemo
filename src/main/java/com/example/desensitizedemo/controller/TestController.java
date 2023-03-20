package com.example.desensitizedemo.controller;

import com.example.desensitizedemo.pojo.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/user")
    public UserInfo getUserInfo(){
        UserInfo userInfo = new UserInfo("test", "18899999999");
        return userInfo;
    }
}
