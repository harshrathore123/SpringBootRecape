package com.example.springbootrecape.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table (name="addEmployee")
public class AddEmployee {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer empid;
    private String empname;
    private String empcity;
    private String empPincode;
    private String empAddress;
    private String attendence;
	public AddEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public String getEmpPincode() {
		return empPincode;
	}
	public void setEmpPincode(String empPincode) {
		this.empPincode = empPincode;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getAttendence() {
		return attendence;
	}
	public void setAttendence(String attendence) {
		this.attendence = attendence;
	}
	public AddEmployee(Integer empid, String empname, String empcity, String empPincode, String empAddress,
			String attendence) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcity = empcity;
		this.empPincode = empPincode;
		this.empAddress = empAddress;
		this.attendence = attendence;
	}
    
    
}
