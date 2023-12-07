package com.infy.firstproject;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @RequestMapping("/")
    public String start(){
        return "Server is Running...";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/details")
    public String details(){
        return "This is my first Spring Boot Application";
    }
}
