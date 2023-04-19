package com.cursoJava.projetoSpring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.projetoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
