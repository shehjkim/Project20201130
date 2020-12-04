package com.yedam.functional;

public class Student {

	private String name;
	private int engScore;
	private int mathScore;
	private String sex;

	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.sex = sex;
		this.engScore = engScore;
		this.mathScore = mathScore;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public String getSex() {
		return sex;
	}

}
