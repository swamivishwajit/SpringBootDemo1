package com.vishwajitswami.util;

public interface BeanValidation {
	public <T> void validate(T object,Class<?> ...groups);

}
