package com.kyc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
	private int employeeId;
	private String employeeName;
	private String address;
	private float sallery;
	private String desig;
	private String comName;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSallery() {
		return sallery;
	}
	public void setSallery(float sallery) {
		this.sallery = sallery;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	
}
