package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Column
	private boolean status;
	
	@Column(length = 30,unique = true)
	private String email;
	
	@Column(length = 30,unique = true)
	private String uid;

	@Id
	@Column(length = 30,unique = true)
	private int rollNo;
	
	@Column(length = 30)
	private char[] narr=new char[30];
	
	@Column(length = 30)
	private char[] carr=new char[30];
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(boolean status, String email, String uid, int rollNo, char[] narr, char[] carr) {
		super();
		this.status = status;
		this.email = email;
		this.uid = uid;
		this.rollNo = rollNo;
		this.narr = narr;
		this.carr = carr;
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public char[] getNarr() {
		return narr;
	}

	public void setNarr(char[] narr) {
		this.narr = narr;
	}

	public char[] getCarr() {
		return carr;
	}

	public void setCarr(char[] carr) {
		this.carr = carr;
	}
}

