package com.app;

public class Test {
	
	private int empId;
	private String empName;

	
	
	
	public Test() {
		super();
	}


	public Test(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	


	@Override
	public String toString() {
		return "Test [empId=" + empId + ", empName=" + empName + "]";
	}


	
	

}
