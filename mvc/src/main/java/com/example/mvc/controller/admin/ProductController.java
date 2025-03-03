package com.example.mvc.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mvc.domain.Product;
import com.example.mvc.service.admin.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/admin/product")
    public String getProduct(Model model) {
        List<Product> products = this.productService.getProduct();
        model.addAttribute("product", products);
        return "/admin/product/product";
    }

    // create
    @GetMapping("/admin/product/create")
    public String createProduct(Model model) {
        return "/admin/product/create";
    }

    // update

    // delete

    // detail
}
