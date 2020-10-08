package com.university.studentdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.university.studentdetails.model.Student;
import com.university.studentdetails.service.StudentService;

@RestController
public class StudentController{


/*@RequestMapping("student")
 * public String student()
 * {
 * return "hi";
 * }
 * 
 */

	
@Autowired
StudentService studentService;

//add or create student data
@PostMapping("student")
public String addStudent(@RequestBody Student student)
{
	studentService.add(student);
	return "student data added";
}

//get all students
@RequestMapping("student")
public List<Student>getAllStudents(){
	
	return studentService.getAllStudents();
}

//get student record by id
@GetMapping("student/{id}")
public Optional<Student> getStudentById(@PathVariable String id)
{
	return studentService.getStudentById(id);
}
	
//update student detail
@PutMapping("student/{id}")
public String updateStudent(@RequestBody Student student,@PathVariable String id)
{
	studentService.updateStudent(id, student);
	return "student detail updated successfully";
}

//delete a student record
@RequestMapping(method=RequestMethod.DELETE, value="student/{id}")
public String deleteStudent(@PathVariable String id)
{
	studentService.deleteStudent(id);
	return "student detail deleted succesfully";
}
}
