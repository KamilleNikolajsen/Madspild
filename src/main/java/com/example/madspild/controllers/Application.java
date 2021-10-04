package com.example.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Application {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
