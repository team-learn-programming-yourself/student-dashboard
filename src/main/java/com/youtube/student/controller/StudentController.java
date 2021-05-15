package com.youtube.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.student.model.Student;
import com.youtube.student.service.StudentService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student) {
		return studentService.registerStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return studentService.getStudents();		
	}
	
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestParam Integer id) {
		studentService.deleteStudent(id);
	}
	
	@PutMapping("/updateStudents")
	public Student updateStudent(@RequestBody Student student) {
		return  studentService.updateStudent(student);
	}
}
