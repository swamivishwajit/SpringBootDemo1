package com.vishwajitswami.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vishwajitswami.exception.ResourceNotFoundException;
import com.vishwajitswami.exception.ValidationFailureException;

@RestControllerAdvice
//@PropertySource("classpath:messages.properties")
public class ExceptionHandlerController implements MessageSourceAware {
	
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleRuntimeException(ResourceNotFoundException exception)
	{
		 System.out.println(exception.getErrorCode());
		 HttpHeaders header=new HttpHeaders();
		 header.add("TOKEN", "HHKNNUHBY-&%%VGGGGG986565C-JNJKUTFRD@#%");
		 System.out.println(messageSource.getMessage(exception.getErrorCode(), null,Locale.US));
		 return new ResponseEntity<>(messageSource.getMessage(exception.getErrorCode(), null,Locale.US),header, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ValidationFailureException.class)
	public ResponseEntity<List<String>> handleConstraintViolationException(ValidationFailureException validationFailureException){
		Set<ConstraintViolation<?>> constraintViolations=validationFailureException.getConstraintFailureExceptions();
		List<String> errors=new ArrayList<String>();
		for(ConstraintViolation<?> violation:constraintViolations)
		{
			errors.add(violation.getMessage());
		}
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}
	

}
