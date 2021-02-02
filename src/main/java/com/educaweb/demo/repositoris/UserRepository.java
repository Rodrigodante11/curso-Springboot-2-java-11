package com.educaweb.demo.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educaweb.demo.entities.User;

public   interface UserRepository extends JpaRepository<User,Long> {
	
	

}