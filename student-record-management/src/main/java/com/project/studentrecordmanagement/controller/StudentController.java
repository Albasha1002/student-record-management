package com.project.studentrecordmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.studentrecordmanagement.model.Student;
import com.project.studentrecordmanagement.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	@GetMapping
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable String id) {
		return studentService.getStudentById(id);
	}
}
