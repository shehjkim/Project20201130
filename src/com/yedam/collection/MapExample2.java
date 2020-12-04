package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "정병기"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(103, "정병기"), 88);

//1.keySet()
		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println(
					"이름: " + student.getStudentName() + ", 학번" + student.getStudentNo() + ", 점수" + map.get(student));
		}
		int Avg=0;
		for(int i=0; i<map.size(); i++) {
			Avg += map.get(map.values());
		}
		int ScoreAvg = Avg / map.size();
		
		System.out.println("평균: " + ScoreAvg);
//2. entrySet()
		Set<Entry<Student, Integer>> entryset = map.entrySet();
		for (Entry<Student, Integer> ent : entryset) {
			System.out.println("key: " + ent.getKey() + ", val" + ent.getValue());
		}

	}

}
