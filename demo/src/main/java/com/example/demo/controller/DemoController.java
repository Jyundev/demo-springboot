package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class DemoController {
    
    // localhost:8080/api/v1/hello
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    // localhost:8080/api/v1/msg/{msg}
    @GetMapping("/message/{msg}")
    public String getMeg(@PathVariable String msg) {
        return "message : " + msg;
    }
}
