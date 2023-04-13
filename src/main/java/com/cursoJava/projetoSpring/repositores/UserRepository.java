package com.cursoJava.projetoSpring.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.projetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
