package com.pedrosts.dev.course.repositories;

import com.pedrosts.dev.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
