package com.yedam.functional;

import java.util.Arrays;
import java.util.List;

public class Students {
	private String name;
	private String sex;
	private int score;
	
	public Students(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

}


