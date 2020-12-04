package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("welcome");

		for (String str : set) { // set:중복된 값은 더이상 안받아들임
			System.out.println(str);
		}

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // iter.hasnext 값이있냐고 물어보는거
			String str = iter.next();
			System.out.println(iter.next()); // iter.next값을 불러와주는거
		}

		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);

		numbers.remove(26);
		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers: " + sum);

	}

}
