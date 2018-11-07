package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ConsumerService;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;
    
    @RequestMapping(value = "/testParams", method = RequestMethod.GET)
    public String testParams() {
        return consumerService.testParams("feign testParams");
    }
}
