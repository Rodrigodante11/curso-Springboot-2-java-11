package com.educaweb.demo.services.exceptions;

public class ResouceNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResouceNotFoundException(Object id) {
		super("Recurso nao encontrado . id "+id);
	}

}
