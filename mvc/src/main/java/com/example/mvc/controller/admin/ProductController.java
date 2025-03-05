package com.example.mvc.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mvc.domain.Product;
import com.example.mvc.service.admin.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public String getCreateProduct(Model model) {
        model.addAttribute("product", new Product());
        return "/admin/product/create";
    }

    @PostMapping("/admin/product/create")
    public String createProduct(Model model, @ModelAttribute("product") Product createProduct) {
        this.productService.saveProduct(createProduct);
        return "redirect:/admin/product";
    }

    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    // update

    // delete

    // detail
}
