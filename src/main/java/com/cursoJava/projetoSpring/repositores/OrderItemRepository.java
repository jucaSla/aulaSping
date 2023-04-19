package com.cursoJava.projetoSpring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.projetoSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}