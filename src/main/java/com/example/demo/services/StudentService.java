package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	StudentRepository srepo;
	
	public List<Student> searchByArr(){
		return srepo.searchByArr();	
	}
	
	public Student save(Student s) {
		return srepo.save(s);
		
	}
}
