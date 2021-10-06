package com.example.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Application {

    @GetMapping("/forside")
    public String frontpage() {
        return "index";
    }

    @GetMapping("/")
    public String index() {
        return index();
    }

    @GetMapping("/om")
    public String about() {
        return "about";
    }

    @GetMapping("/ideer")
    public String ideas() {
        return "ideas";
    }

    @GetMapping("/donation")
    public String donate() {
        return "donation";
    }

    @GetMapping("/kontakt")
    public String contact() {
        return "contact";
    }

    @GetMapping("/subscribe")
    public String subscribe() {
        return "subscribe";
    }
}
