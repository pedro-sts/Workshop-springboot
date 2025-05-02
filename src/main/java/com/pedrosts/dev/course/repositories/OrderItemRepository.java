package com.pedrosts.dev.course.repositories;

import com.pedrosts.dev.course.entities.OrderItem;
import com.pedrosts.dev.course.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
}
