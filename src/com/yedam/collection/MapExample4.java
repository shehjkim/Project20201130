package com.yedam.collection;

import java.util.TreeSet;

public class MapExample4 {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(55);
		
		System.out.println(tset.first());
		System.out.println(tset.last());
		
		TreeSet<String> tstr = new TreeSet<>();
		tstr.add("Hong");
		tstr.add("Hwang");
		tstr.add("Park");
		tstr.add("Choi");
		System.out.println(tstr.first());
		System.out.println(tstr.last());
		
		TreeSet<Student> tstu = new TreeSet<>();
		tstu.add(new Student(100, "Hong"));
		tstu.add(new Student(101, "Hwang"));
		tstu.add(new Student(102, "Park"));
		
		System.out.println(tstu.first().getStudentNo()+","+tstu.last().getStudentNo());
		
	}

}
