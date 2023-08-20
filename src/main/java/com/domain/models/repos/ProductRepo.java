package com.domain.models.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.models.entities.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{
 List<Product> findByNameContains(String name);
}