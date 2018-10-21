package com.vishwajitswami.util;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.vishwajitswami.exception.ValidationFailureException;

@Component
public class BeanValidationImpl implements BeanValidation {

	private final Validator validator;
	public BeanValidationImpl(){
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		validator=factory.getValidator();
	}
	
	
	@Override
	public <T> void validate(T object, Class<?>... groups) {
		Set<ConstraintViolation<T>> cvs=validator.validate(object, groups);
		if(!CollectionUtils.isEmpty(cvs))
		{
			Set<ConstraintViolation<?>> errors=new HashSet<>(cvs.size());
			errors.addAll(cvs);
			throw new ValidationFailureException(errors);
		}
	}

}
