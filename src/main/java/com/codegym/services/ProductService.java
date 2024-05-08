package com.codegym.services;

import com.codegym.model.Product;
import com.codegym.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}
