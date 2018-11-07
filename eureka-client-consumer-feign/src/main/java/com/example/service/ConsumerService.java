package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("SERVICE-PRODUCER")
public interface ConsumerService {
    @RequestMapping(value = "/testParams", method = RequestMethod.GET)
    String testParams(@RequestParam String code);
}
