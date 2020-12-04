package com.yedam.interfaces;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행.");

	}

}

class NewRun implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운 실행.");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() { // Runnable-인터페이스 . new라는 키워드로 {} 안에서 클래스 이름없이 선언
			@Override // 인터페이스는 new로 선언 안됨. 정렬만 가능
			public void run() {
				System.out.println("익명 실행");
			}
		};
		runnable.run();

		runnable = () -> System.out.println("또 다른 익명 실행");

		runnable.run();

	}
}