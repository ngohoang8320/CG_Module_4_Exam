package com.codegym.controllers;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    ProductService productService;

    @GetMapping("")
    public String goToManagePage(Model model) {
        List<Product> productList = productService.findAllProduct();
        model.addAttribute("productList",
                productList);
        return "managePage";
    }
}
