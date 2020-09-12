package com.ksk.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Departments {
	
	@Id
    @Column(name="dept_no")
	private String dept_no;
	
    @Column(name="dept_name")
	private String dept_name;
	
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}  
	
	public Departments(String dept_no, String dept_name) {
		super();
		this.dept_no = dept_no;
		this.dept_name = dept_name;
	}

	public String getDept_no() {
		return dept_no;
	}

	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
}
