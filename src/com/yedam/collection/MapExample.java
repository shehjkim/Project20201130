package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		//Map<앞,뒤> 앞:키에 해당되는 타임 / 뒤-value에 해당되는 타입
		map.put("Hong",15);
		map.put("Hwang",20);
		map.put("Kim", 30);
		
		Integer val = map.get("Hong"); //Hong이라는 키를 가진 value를 출력
		System.out.println(val); 
		
		Set<String> set = map.keySet();
		for(String num: set) {
			System.out.println("key:" + num);
		}
		Set<Entry<String,Integer>> entryset1 = map.entrySet();
		for(Entry<String,Integer> ent:entryset1) {
			System.out.println("key: "+ent.getKey() + ",val: " + ent.getValue());
		}
	
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");
		String result = mapInt.get(10);	//10번 키를 가진 value를 출력
		System.out.println(result);
		
		Set<Integer> set2 = mapInt.keySet(); //set1이란 컬렉션에 mapInt에 key값만 넣음
		for(Integer num: set2) {
			System.out.println("key: " + num);
		}
		//Entry : key와 value 값을 모두 가져옴
		Set <Entry<Integer,String>> entryset =  mapInt.entrySet();
		 for(Entry<Integer, String> ent:entryset) {
			 System.out.println("key: "+ent.getKey()+", val:" + ent.getValue());
		 }
	}

}
