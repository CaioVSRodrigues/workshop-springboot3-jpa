package com.caiovinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiovinicius.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
