package com.example.mvc.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/")
    public String getDashboard() {
        return "admin/dashboard/home";
    }

    @GetMapping("/admin")
    public String getDashboardHome() {
        return "admin/dashboard/home";
    }
}
