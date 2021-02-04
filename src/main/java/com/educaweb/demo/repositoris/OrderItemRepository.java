package com.educaweb.demo.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.OrderItem;


public   interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
	
}