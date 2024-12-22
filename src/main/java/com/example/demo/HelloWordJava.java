package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWordJava {
    @GetMapping("/")
    public String index() {
        return "HelloWord ffff!!!";
    }

}
