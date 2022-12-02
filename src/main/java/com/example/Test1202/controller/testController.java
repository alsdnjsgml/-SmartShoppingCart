package com.example.Test1202.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")

public class testController {
    @GetMapping
    public String home(){
        //System.out.println("hello");
        return "home.html" ;
    };


}
