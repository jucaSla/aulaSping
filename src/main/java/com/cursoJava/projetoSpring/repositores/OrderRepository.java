package com.cursoJava.projetoSpring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.projetoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
