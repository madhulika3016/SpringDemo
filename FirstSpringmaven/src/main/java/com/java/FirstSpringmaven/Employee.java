package com.java.FirstSpringmaven;

public class Employee {
	
	String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Employee [name=" + sname + "]";
	}
	public void work()
	{
		System.out.println("Employee is working......");
	}

}
