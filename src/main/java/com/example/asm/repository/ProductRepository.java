package com.example.asm.repository;

import com.example.asm.entity.Product;
import com.example.asm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
