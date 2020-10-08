package com.university.studentdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.studentdetails.model.Student;
import com.university.studentdetails.repository.StudentRepo;

@Service
public class StudentService{

	
	@Autowired
	StudentRepo studentRepo;
	
	public void add(Student student) {
	studentRepo.save(student);
		
	}

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	public Optional<Student> getStudentById(String id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	
	public void updateStudent(String id, Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
		
	}

	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}
	
}

