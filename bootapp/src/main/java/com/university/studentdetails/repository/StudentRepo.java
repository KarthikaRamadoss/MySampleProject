package com.university.studentdetails.repository;  
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.university.studentdetails.model.Student;  
public interface StudentRepo extends JpaRepository<Student,String>
{  
	
	
}  