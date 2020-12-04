package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");							//인덱스추가는 add
		list.add("Hello");
		list.add("world");
		list.add("welcome");
		list.add(1, "Nice"); 						// 인덱스 값이 1위치에 nice를 넣어줌
		System.out.println("size: " + list.size()); // collection의 몇개의 값이 들어있는지 확인=size
		list.add(list.size(), "last");

		list.remove(1);								//인덱스값이 1 위치에있는거 지움(world)
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index:" + i + "," + list.get(i));
		}
		
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		
		int sum=0;
		for(Integer num: listNum) {
			sum +=num;
			
		}
		System.out.println("listNum합계: "+sum);
		

	}

}
