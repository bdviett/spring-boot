package com.example.demo;

public class EmployeeAddress {
	private String duong;
	private String thanhpho;
	
	/**
	 * @return the duong
	 */
	public String getDuong() {
		return duong;
	}
	/**
	 * @param duong the duong to set
	 */
	public void setDuong(String duong) {
		this.duong = duong;
	}
	/**
	 * @return the thanhpho
	 */
	public String getThanhpho() {
		return thanhpho;
	}
	/**
	 * @param thanhpho the thanhpho to set
	 */
	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}
	
	@Override
	public String toString() {
		return "EmployeeAddress [duong=" + duong + ", thanhpho=" + thanhpho + "]";
	}
	
	
}
