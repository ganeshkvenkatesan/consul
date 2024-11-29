package com.example.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {


    @Value("${username}")
    private String name;

    @Value("${age}")
    private int age;

    @GetMapping("/")
    public String home() {

        return "Hello " + name + " " + age;
    }

}
