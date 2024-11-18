package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sabuncontroller {

    @GetMapping("/api/v1/user")
    public String getUserID() {
        return "82272688";
    }
}
