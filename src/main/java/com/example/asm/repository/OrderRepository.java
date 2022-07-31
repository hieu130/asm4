package com.example.asm.repository;

import com.example.asm.entity.Order;
import com.example.asm.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository
        extends JpaRepository<Order, String>, JpaSpecificationExecutor<Order> {

}
