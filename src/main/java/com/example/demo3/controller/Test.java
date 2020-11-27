package com.example.demo3.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Test {
    @GetMapping("/test")
    public JSONObject test(){
        JSONObject result = new JSONObject();
        result.put("code", 1);
        result.put("message", "Hello World!");
        return result;
    }
}
