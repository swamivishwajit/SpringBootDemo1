package com.vishwajitswami.service.impl;

import java.security.Provider.Service;
import java.util.List;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vishwajitswami.dao.StudentRepository;
import com.vishwajitswami.exception.ResourceNotFoundException;
import com.vishwajitswami.model.Student;
import com.vishwajitswami.service.StudentService;


import static junit.framework.Assert.*;

@Configuration
@ComponentScan(basePackages={"com.vishwajitswami"})

public class StudentServiceImplTest {
	
	private static StudentService studService;
	
	@BeforeClass
	public static void setUp(){
		StudentServiceImpl impl=new StudentServiceImpl();
		impl.setStudRepo(new StudentRepository() {
			
			@Override
			public <S extends Student> Iterable<S> saveAll(Iterable<S> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<Student> findById(Long arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Iterable<Student> findAllById(Iterable<Long> arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean existsById(Long arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void deleteById(Long arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll(Iterable<? extends Student> arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteAll() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public long count() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Student save(Student student) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Student findByrollnumber(long rollnumber) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Student> findAll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void delete(Student student) {
				// TODO Auto-generated method stub
				
			}
		});
		studService=impl;
	}
	@Ignore
	@Test(expected=ResourceNotFoundException.class)
	public void testforStudentNotFound(){
		studService.getById(99);
	}
	
	@Test
	public void getByIdTest(){
		assertEquals("Nakul Nakul", studService.getById(7));
	}

	
}
