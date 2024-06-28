package com.bezkoder.spring.jpa.postgresql.repository;

import java.util.List;

import com.bezkoder.spring.jpa.postgresql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
  List<Product> findByPublished(boolean published);

  List<Product> findByNameContaining(String name);
}
