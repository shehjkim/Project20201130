package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".length());
		System.out.println("HelloWorld".length());
		System.out.println("=====================");
		
		List<String> olist = new ArrayList<>();
		olist.add("Hello");
		
		for(Object str : olist) {
			String s = (String) str;
			System.out.println(s);
			System.out.println("=====================");
		}
		
		List<String> list = new ArrayList<>(); // 배열처럼 List에 <>안에 타입지정
		list.add(new String("Hello"));
		list.add(new String("world"));
		list.add("welcome"); // 추가는 add, 지우는건 remove
		list.add(new String("Hello")); // 인덱스별로 저장하기때문에 중복값도 가능

		list.get(1);

		for (int i = 0; i < list.size(); i++) { // 인덱스크기:set.size()
			System.out.println(list.get(i));
		}
		for (String str : list) { // 위와같음
			System.out.println(str);
		}
		System.out.println("=====================");
		Set<String> set = new HashSet<>();			//set은 중복구문 인정x,같은값은 한번만 출력
		set.add("Hello"); // set이라고하는 컬렉션을 상속하는것
		set.add("world");
		set.add("Hello");

		Iterator<String> iter = set.iterator(); // 반복구문 찾을수있음
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (String str : set) {
			System.out.println(str);
		}

		Set<Fruit> fruits = new HashSet<>();// fruit 이라는 클래스 생성 먼저
		fruits.add(new Fruit("Apple", 1000));// 3개의 인스턴스 생성
		fruits.add(new Fruit("Banana", 1500));// Fruit이라는 타입으로 생성
		fruits.add(new Fruit("Orange", 2000));
		fruits.add(new Fruit("Apple", 1000));//Fruit 클래쓰 젤 밑 equals보기
		
		Iterator<Fruit> fiter = fruits.iterator();
		while (fiter.hasNext()) { // 가지고올 반복구문이 있는지
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName() + "-" + fruit.getPrice());

		}
	}

}
