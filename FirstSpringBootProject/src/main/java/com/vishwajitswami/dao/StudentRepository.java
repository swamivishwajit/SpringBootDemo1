package com.vishwajitswami.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vishwajitswami.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	public List<Student> findAll();
	public Student findByrollnumber(long rollnumber);
	@SuppressWarnings("unchecked")
	public Student save(Student student);
	public void delete(Student student);
	


}
