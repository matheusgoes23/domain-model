package com.matheusgoes23.domain.model.repository;

import com.matheusgoes23.domain.model.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
