package com.pedrosts.dev.course.services;

import com.pedrosts.dev.course.entities.Product;
import com.pedrosts.dev.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        Optional<Product> user = productRepository.findById(id);
        return user.get();
    }
}
