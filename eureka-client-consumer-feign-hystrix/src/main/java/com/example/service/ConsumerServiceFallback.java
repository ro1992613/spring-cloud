package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceFallback implements ConsumerService{

    @Override
    public String testParams(String code) {
        // TODO Auto-generated method stub
        return "当前服务未启动！";
    }

}
