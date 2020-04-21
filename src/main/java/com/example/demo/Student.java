package com.example.demo;

public class Student {
	private StudentAddress address;

	/**
	 * @return the studentAddress
	 */
	public StudentAddress getAddress() {
		return address;
	}

	/**
	 * @param studentAddress the studentAddress to set
	 */
	public void setAddress(StudentAddress studentAddress) {
		this.address = studentAddress;
	}
	
	@Override
	public String toString () {
		return "Student [address = " + address + "]";
	}
}
