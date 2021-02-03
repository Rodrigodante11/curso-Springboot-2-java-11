package com.educaweb.demo.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.Order;

public   interface OrderRepository extends JpaRepository<Order,Long> {
	
}