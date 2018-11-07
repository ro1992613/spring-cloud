package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.EurekaInstanceConfig;

@RestController
public class ProduceroController {

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;
    @Value("${server.port}")
    private int serverPort = 0;

    @RequestMapping(value = "/producer", method = RequestMethod.GET)
    public String hello() {
        System.out.println("/producer, instanceId:"+eurekaInstanceConfig.getInstanceId()+", host:"+eurekaInstanceConfig.getHostName(false));
        return "Hello, Spring Cloud! My port is " + String.valueOf(serverPort);
    }
    
    @RequestMapping(value = "/testParams", method = RequestMethod.GET)
    public String testParams(@RequestParam String code) {
        System.out.println("/producer, instanceId:"+eurekaInstanceConfig.getInstanceId()+", host:"+eurekaInstanceConfig.getHostName(false)+", code:"+code);
        return "Hello, Spring Cloud! My port is " + String.valueOf(serverPort)+"/producer, instanceId:"+eurekaInstanceConfig.getInstanceId()+", host:"+eurekaInstanceConfig.getHostName(false)+", code:"+code;
    }
}
