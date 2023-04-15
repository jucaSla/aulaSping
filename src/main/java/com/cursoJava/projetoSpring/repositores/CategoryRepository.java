package com.cursoJava.projetoSpring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.projetoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
