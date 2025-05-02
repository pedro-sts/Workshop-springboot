package com.pedrosts.dev.course.services;

import com.pedrosts.dev.course.entities.Category;
import com.pedrosts.dev.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
        Optional<Category> cat = categoryRepository.findById(id);
        return cat.get();
    }
}
