package com.example.Uni_App;

public class Student {
	private int roll_no;
	private String name;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
		
	}
}
