package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${configserver}")
    String configserver;

    @Value("${name}")
    String name;

    @RequestMapping(value = "/getConfig", method = RequestMethod.GET)
    public String home() {
        return "Hello world ,configserver:" + configserver+",name="+name;
    }

    
}
