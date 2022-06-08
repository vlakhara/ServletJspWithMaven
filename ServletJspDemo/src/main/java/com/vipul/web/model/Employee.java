package com.vipul.web.model;

public class Employee {
	private double salary;
	private String empName;
	private String gender;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String string) {
		this.gender = string;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
}
