package com.caiovinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiovinicius.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
