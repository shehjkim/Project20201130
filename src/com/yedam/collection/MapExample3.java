package com.yedam.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample3 {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101, "Hong", "HONG", 1000));
		set.add(new Employee(102, "Hwang", "HWANG", 2000));
		set.add(new Employee(103, "Park", "PARK", 3000));
		set.add(new Employee(104, "Choi", "CHOI", 3500));

		// 사번,이름만 가져옴 -- 필드중 몇개만 가져올때
		Map<Integer, String> map = new HashMap<>();
		for (Employee emp : set) {
			map.put(emp.getEmployeeId(), emp.getLastName());
		}

		// 이름,샐러리만 가져옴
		Map<String,Integer> map1 = new HashMap<>();
		for (Employee emp : set) {
			map1.put(emp.getLastName(), emp.getSalary());
		}
		
		
		
	}
}
