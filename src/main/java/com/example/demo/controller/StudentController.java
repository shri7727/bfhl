package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService sService;
	
	@PostMapping("/addstudent") 
	  public Student save(@RequestBody Student s ){ 
		  return sService.save(s);
	  }
	
	@PostMapping("/searchByArr")
	public List<Student> searchbykeyword(@RequestBody Student s1) {
		return sService.searchByArr();
}
	}
