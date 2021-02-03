package com.educaweb.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educaweb.demo.entities.Order;
import com.educaweb.demo.repositoris.OrderRepository;


@Component
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	public  Order findById(Long id) {
		Optional<Order>obj=repository.findById(id);
		return obj.get(); 
	}
}
