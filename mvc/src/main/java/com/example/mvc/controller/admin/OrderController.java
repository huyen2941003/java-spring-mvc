package com.example.mvc.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
    @GetMapping("/admin/order")
    public String getProduct() {
        return "/admin/order/order";
    }

    // create

    // update

    // delete

    // detail
}
