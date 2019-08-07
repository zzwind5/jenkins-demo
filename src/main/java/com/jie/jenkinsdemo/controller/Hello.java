package com.jie.jenkinsdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${msg.hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello() {
        return hello;
    }
}
