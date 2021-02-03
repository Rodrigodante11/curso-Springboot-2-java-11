package com.educaweb.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educaweb.demo.entities.Product;
import com.educaweb.demo.repositoris.ProductRepository;


@Component
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	public  Product findById(Long id) {
		Optional<Product>obj=repository.findById(id);
		return obj.get(); 
	}
}
