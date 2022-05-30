package com.renanoliveira.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renanoliveira.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
