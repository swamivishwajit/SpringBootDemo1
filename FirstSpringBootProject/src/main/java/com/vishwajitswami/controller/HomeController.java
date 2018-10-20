package com.vishwajitswami.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishwajitswami.model.Student;
import com.vishwajitswami.service.StudentService;

/**
 * 
 * @author Vishwajit
 *
 */
@RestController
public class HomeController {
	
	
	@Autowired
	
	private StudentService service;
	
	@GetMapping(value="/")
	public String hellowMessage(){
		return "Hello Welcome to Swami Vishwajit Tutorials!";
	}
	@GetMapping(value="/student/{rollnumber}")
	public Student findByrollnumber(@PathVariable long rollnumber){
		return service.getById(rollnumber);
	}
	
	@GetMapping(value="/student")
	public List<Student> findAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping(value="/student")
	public void saveStudent(@RequestBody Student student){
		service.save(student);
	}
	@DeleteMapping(value="/student/{rollnumber}")
	public void deleteStudent(@PathVariable long rollnumber){
		service.deleteStudent(rollnumber);
	}
	
	@PutMapping(value="/student")
	public void updateStudent(@RequestBody Student student){
		service.update(student);
	}
	

}
