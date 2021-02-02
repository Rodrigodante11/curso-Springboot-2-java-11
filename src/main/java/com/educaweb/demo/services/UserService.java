package com.educaweb.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educaweb.demo.entities.User;
import com.educaweb.demo.repositoris.UserRepository;


@Component
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public  User findById(Long id) {
		Optional<User>obj=repository.findById(id);
		return obj.get(); 
	}
}
