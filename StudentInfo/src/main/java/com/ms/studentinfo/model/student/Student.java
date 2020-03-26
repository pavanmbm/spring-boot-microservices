package com.ms.studentinfo.model.student;

public class Student {

	private int id;
	private String name;
	private int score;
	private String branch;
	
	
	
	public Student(int id, String name, int score, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
