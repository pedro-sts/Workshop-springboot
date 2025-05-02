package com.pedrosts.dev.course.repositories;

import com.pedrosts.dev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
