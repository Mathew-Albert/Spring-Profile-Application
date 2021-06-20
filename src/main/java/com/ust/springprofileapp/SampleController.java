package com.ust.springprofileapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SampleController {


    @Value("${spring.message}")
    private String message;

    @GetMapping
    public String hello() {
        return message;
    }
}
