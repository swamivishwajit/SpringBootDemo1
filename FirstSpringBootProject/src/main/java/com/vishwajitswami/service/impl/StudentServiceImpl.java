package com.vishwajitswami.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwajitswami.constraints.CreateStudent;
import com.vishwajitswami.constraints.UpdateStudent;
import com.vishwajitswami.dao.StudentRepository;
import com.vishwajitswami.exception.ResourceNotFoundException;
import com.vishwajitswami.model.Student;
import com.vishwajitswami.service.StudentService;
import com.vishwajitswami.util.BeanValidation;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	public void setStudRepo(StudentRepository studRepo) {
		this.studRepo = studRepo;
	}

	@Autowired
	private BeanValidation beanValidation; 
	
	@Override
	public List<Student> getAllStudents() {
		return studRepo.findAll();
	}

	@Override
	public Student getById(long roll) {
		Student student=studRepo.findByrollnumber(roll);
		if(null==student){
			throw new ResourceNotFoundException("ERR001");
		}
		return student;
	}

	@Override
	public void save(Student student) {
		beanValidation.validate(student, CreateStudent.class);
		studRepo.save(student);
		
	}

	@Override
	public void deleteStudent(long roll) {
		Student student=getById(roll);
		if(null==student){
			throw new ResourceNotFoundException("ERR001");
		}
		studRepo.delete(student);
	}

	@Override
	public void update(Student student) {
		beanValidation.validate(student, CreateStudent.class,UpdateStudent.class);
		Student student1=getById(student.getRoll_number());
		if(null==student1){
			throw new ResourceNotFoundException("ERR001");
		}
		studRepo.save(student);
	}
	

}
