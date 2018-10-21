package com.vishwajitswami.exception;

public class CoreRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public CoreRuntimeException(String errorCode){
		super();
		this.errorCode=errorCode;
	}
	public CoreRuntimeException(String errorCode,String message){
		super(message);
		this.errorCode=errorCode;
	}
	public CoreRuntimeException(String errorCode,Throwable cause){
		super(cause);
		this.errorCode=errorCode;
	}
	public CoreRuntimeException(String errorCode,String message,Throwable cause){
		super(message, cause);
		this.errorCode=errorCode;
	}
	
	
	

}
