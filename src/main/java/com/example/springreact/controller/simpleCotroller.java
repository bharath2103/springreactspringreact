package com.example.springreact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleCotroller {


    @GetMapping("/simple")
    public String sample(){
        return "God is great";
    }
}
