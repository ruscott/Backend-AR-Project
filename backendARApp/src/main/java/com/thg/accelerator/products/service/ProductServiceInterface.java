package com.thg.accelerator.products.service;


import com.thg.accelerator.products.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductServiceInterface {
    Product createProduct(Product product);
    List<Product> getAllProducts();
}
