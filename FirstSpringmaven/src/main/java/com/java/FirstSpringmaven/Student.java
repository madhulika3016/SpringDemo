package com.java.FirstSpringmaven;

public class Student {
	
	int id;
	String sname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Student(int id) {
		super();
		this.id = id;
	}
	
	
	public Student(String sname) {
		super();
		this.sname = sname;
	}
	public Student(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	

}
