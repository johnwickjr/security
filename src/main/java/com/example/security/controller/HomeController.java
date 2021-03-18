package com.example.security.controller;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/get")
    public String testing() {
        return "hello world";
    }

    @GetMapping("/get2")
    public String testing123() {
        return "this is from get2";
    }

    @GetMapping("/admin")
    public String admin() {
        return "this is for admin only";
    }

    @GetMapping("/user")
    public String user() {
        return "this is for user";
    }

}
