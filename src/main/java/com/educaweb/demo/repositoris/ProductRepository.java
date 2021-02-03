package com.educaweb.demo.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;


import com.educaweb.demo.entities.Product;


public   interface ProductRepository extends JpaRepository<Product,Long> {
	
}