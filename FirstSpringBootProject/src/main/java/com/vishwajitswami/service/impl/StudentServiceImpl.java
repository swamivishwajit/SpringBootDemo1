package com.vishwajitswami.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwajitswami.dao.StudentRepository;
import com.vishwajitswami.model.Student;
import com.vishwajitswami.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	
	private StudentRepository studRepo;
	@Override
	public List<Student> getAllStudents() {
		return studRepo.findAll();
	}

	@Override
	public Student getById(long roll) {
		return studRepo.findByrollnumber(roll);
	}

	@Override
	public void save(Student student) {
		studRepo.save(student);
		
	}

	@Override
	public void deleteStudent(long roll) {
		Student student=getById(roll);
		if(null!=student){
			studRepo.delete(student);
		}
		
	}

	@Override
	public void update(Student student) {
		studRepo.save(student);
		
	}
	

}
