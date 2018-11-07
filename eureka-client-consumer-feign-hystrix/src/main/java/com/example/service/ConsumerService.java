package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="SERVICE-PRODUCER", fallback = ConsumerServiceFallback.class)
public interface ConsumerService {
    @RequestMapping(value = "/testParams", method = RequestMethod.GET)
    String testParams(@RequestParam("code")  String code);
}
