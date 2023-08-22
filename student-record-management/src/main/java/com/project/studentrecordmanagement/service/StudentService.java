package com.project.studentrecordmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.studentrecordmanagement.model.Student;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

@Service
public class StudentService {
	
	List<Student> studentList=new ArrayList<>();
	
	@Autowired
	private ObservationRegistry observationRegistry;
		

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
//		return student;
		return Observation.createNotStarted("addStudent", observationRegistry)
				 .observe(()->student);
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		return Observation.createNotStarted("getStudents", observationRegistry)
				        .observe(()->studentList);
	}
    @GetMapping
	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
//    	return  studentList
//    			   .stream()
//    	           .filter(student->student.id().equals(id))
//    	           .findFirst()
//    	           .orElseThrow(()->new RuntimeException("Student is not found"));
//    	
    	return Observation.createNotStarted("getStudentByID", observationRegistry)
    			      .observe(()->studentList
    			   .stream()
    	           .filter(student->student.id().equals(id))
    	           .findFirst()
    	           .orElseThrow(()->new RuntimeException("Student is not found")));
		 
	}

}
