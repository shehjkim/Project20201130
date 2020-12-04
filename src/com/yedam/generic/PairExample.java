package com.yedam.generic;

public class PairExample {
	
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair <String, Integer> ();
		pair.setKind("Hello");
		pair.setModel(1000);
		
		Pair<Audio, String> audio = new pair<Audio, String>();
		audio.setKind(new Audio());
		audio.setModel("AD303");
		
		
		Pair<Tv, String> tv = new Pair<Tv, String> ();
		tv.setKind(new Tv());
		tv.setModel("평면TV");
		
		
		 
		System.out.println(pair.getkind() + "," + pair.getModel());
	}

}
