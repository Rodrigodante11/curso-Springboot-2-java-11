package com.educaweb.demo.services;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.educaweb.demo.entities.User;
import com.educaweb.demo.repositoris.UserRepository;
import com.educaweb.demo.services.exceptions.DatabaseException;
import com.educaweb.demo.services.exceptions.ResouceNotFoundException;


@Component
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public  User findById(Long id) {
		Optional<User>obj=repository.findById(id);
		return obj.orElseThrow(()-> new ResouceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new  ResouceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	public User update(Long id,User obj) {
		try {
			User entity=repository.getOne(id);
			updateData(entity,obj);
			return repository.save(entity);
		}catch(RuntimeException e) {
			
			throw new ResouceNotFoundException(id);
		}
		
	}
	private void updateData(User entity, User obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
