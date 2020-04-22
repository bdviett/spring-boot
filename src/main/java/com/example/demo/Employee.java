package com.example.demo;

public class Employee {
	private EmployeeAddress employeeAddress;

	/**
	 * @return the employeeAddress
	 */
	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeAddress=" + employeeAddress + "]";
	}
	
	
}
