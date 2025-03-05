package com.example.mvc.service.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mvc.domain.Product;
import com.example.mvc.repository.admin.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct() {
        return this.productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return this.productRepository.save(product);
    }
}
