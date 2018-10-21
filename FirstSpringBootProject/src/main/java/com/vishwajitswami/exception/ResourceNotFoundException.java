package com.vishwajitswami.exception;

public class ResourceNotFoundException extends CoreRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String errorCode) {
		super(errorCode);
		// TODO Auto-generated constructor stub
	}
	
	public ResourceNotFoundException(String errorCode,String message) {
		super(errorCode,message);
	}
	
	public ResourceNotFoundException(String errorCode,Throwable cause) {
		super(errorCode,cause);
	}
	
	public ResourceNotFoundException(String errorCode,String message,Throwable cause) {
		super(errorCode,message,cause);
	}
	

}
