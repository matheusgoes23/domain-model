package com.matheusgoes23.domain.model.repository;

import com.matheusgoes23.domain.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
