package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage() {
        return "hello";
    }
}
/*
 * @RestController
 * public class UserController {
 * 
 * private UserService userService;
 * 
 * public UserController(UserService userService) {
 * this.userService = userService;
 * }
 * 
 * @RequestMapping("")
 * public String getHomePage() {
 * return this.userService.getHomePage();
 * }
 * }
 */