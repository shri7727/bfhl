package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	 @Query(value ="insert into student(status,email,uid,rollNo,narr,carr)	values(?1,?2,?3,?4,?5,?6)",nativeQuery = true)
	 public void addStud(boolean status, String email, String uid, int rollNo, char[] narr, char[] carr);
	 
	  @Query(value = "select * from student ",
			  nativeQuery = true) public List<Student> searchByArr();

	

}
