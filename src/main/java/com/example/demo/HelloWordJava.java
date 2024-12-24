package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWordJava {
    @GetMapping("/")
    public String index() {
        return "HelloWord ffff!!!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "HelloWord user!!!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "HelloWord admin!!!";
    }
}
