package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

    @RequestMapping("/")
    public String getHomePage() {
        return "Hello getHomePage user";
    }
}