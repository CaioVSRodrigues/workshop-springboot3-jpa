package com.caiovinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiovinicius.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
