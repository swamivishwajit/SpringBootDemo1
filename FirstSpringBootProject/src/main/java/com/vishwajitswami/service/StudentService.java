package com.vishwajitswami.service;

import java.util.List;

import com.vishwajitswami.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();
    public Student getById(long roll);
    public void save(Student student);
    public void deleteStudent(long roll);
    public void update(Student student);

}
