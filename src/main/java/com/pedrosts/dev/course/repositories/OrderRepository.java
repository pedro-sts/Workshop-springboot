package com.pedrosts.dev.course.repositories;

import com.pedrosts.dev.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
