package com.yedam.collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "Hong");
		scores.put(98, "Hwang");
		scores.put(95, "Park");
		scores.put(75, "Choi");
		scores.put(80, "Kim");
		System.out.println("scores:첫번째 " + scores.firstEntry().getKey());

		NavigableMap<Integer, String> navigableMap = scores.descendingMap();
		System.out.println(navigableMap.firstEntry());

		NavigableSet<Integer> nSet = scores.descendingKeySet();
		System.out.println("scores 첫번째 키: " + scores.firstKey());
		System.out.println("nSet: 첫번째 키: " + nSet.first());

		// {34 55 26 48 77} 오름 차순 정렬 결과 값을 구하는 코드 구현.
		int[] intAry = { 34, 55, 26, 48, 77 };
		TreeMap<Integer, Integer> ary = new TreeMap<Integer, Integer>();
		ary.put(34, 34);
		ary.put(55, 26);
		ary.put(26, 26);
		ary.put(48, 48);
		ary.put(77, 77);
		//첫번째 방법
		NavigableMap<Integer, Integer> descendingMap = ary.descendingMap();
		Set<Map.Entry<Integer, Integer>> ascendingEntrySet = ary.entrySet();
		for (Map.Entry<Integer, Integer> entry : ascendingEntrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + " ");
		}
		//두번째 방법
		TreeSet<Integer> tSet = new TreeSet<>();
		for (int i = 0; i < intAry.length; i++) {
			tSet.add(intAry[i]);
		}
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = tSet.pollFirst();
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

	}

}
