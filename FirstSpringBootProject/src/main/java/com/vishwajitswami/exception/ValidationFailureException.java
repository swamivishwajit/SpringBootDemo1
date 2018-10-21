package com.vishwajitswami.exception;

import java.util.Set;

import javax.validation.ConstraintViolation;

public class ValidationFailureException extends CoreRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<ConstraintViolation<?>> constraintFailureExceptions;
	public ValidationFailureException(Set<ConstraintViolation<?>> constraintViolation)
	{
		super(null);
		this.constraintFailureExceptions=constraintViolation;
	}
	
	public Set<ConstraintViolation<?>> getConstraintFailureExceptions() {
		return constraintFailureExceptions;
	}
	

}
