package com.educaweb.demo.resouces.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educaweb.demo.services.exceptions.ResouceNotFoundException;

@ControllerAdvice
public class ResouceExceptionHandler {

	@ExceptionHandler(ResouceNotFoundException.class)
	public ResponseEntity<StandardError> resouceNotFound(ResouceNotFoundException e,HttpServletRequest request){
		String error ="Recurso nao encontrado";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err= new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		
	}
	
	
}
