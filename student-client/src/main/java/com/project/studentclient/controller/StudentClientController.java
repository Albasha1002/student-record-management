package com.project.studentclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.project.studentclient.model.Student;
import com.project.studentclient.service.StudentClientService;

@RestController
@RequestMapping("/client/students")
public class StudentClientController {
	
	@Autowired
	private StudentClientService studentClientService;
	@GetMapping()
	List<Student> getAllStudents(){
		return studentClientService.getAllStudents();
	}

}
