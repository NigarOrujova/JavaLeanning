package com.javaguides.springbootbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "hello world";
    }
    @GetMapping("/secured")
    public String secured(){
        return "hello,sacured";
    }
}
