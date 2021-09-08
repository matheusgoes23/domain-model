package com.matheusgoes23.domain.model.repository;

import com.matheusgoes23.domain.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
