package com.matheusgoes23.domain.model.repository;

import com.matheusgoes23.domain.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
