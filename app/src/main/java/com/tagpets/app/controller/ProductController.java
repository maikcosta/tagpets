package com.tagpets.app.controller;

import com.tagpets.app.model.entities.Product;
import com.tagpets.app.model.entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
//    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public @ResponseBody Product newProduct(@RequestParam String name){
        Product product = new Product(name);
        productRepository.save(product);
        return product;
    }
}
