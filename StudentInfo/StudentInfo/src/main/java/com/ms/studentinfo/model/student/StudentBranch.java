package com.ms.studentinfo.model.student;

public class StudentBranch {

	private int id;
	private String branch;
	
	public StudentBranch() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentBranch(int id, String branch) {
		this.id = id;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
}
