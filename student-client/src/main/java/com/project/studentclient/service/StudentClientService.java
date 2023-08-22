package com.project.studentclient.service;

import java.util.List;

import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import com.project.studentclient.model.Student;

@HttpExchange("/students")
public interface StudentClientService {
	@GetExchange
	List<Student> getAllStudents();

}
