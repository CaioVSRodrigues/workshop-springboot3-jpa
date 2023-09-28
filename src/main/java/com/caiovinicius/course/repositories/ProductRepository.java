package com.caiovinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiovinicius.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
