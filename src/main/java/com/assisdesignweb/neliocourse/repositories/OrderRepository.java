package com.assisdesignweb.neliocourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assisdesignweb.neliocourse.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
