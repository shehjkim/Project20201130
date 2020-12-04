package com.yedam.interfaces;

// 함수적 인터페이스 (Functional Interface)
interface Cal { // cal이라는 인터페이스
	public void multi(int num); // int타입의 추상메소드가 있음
								// 람다 표현식으로 하려면 메소드안에 하나만 있어야함
}

interface Calculate { // calculate 인터페이스
	public void sum(int num1, int num2);

}

public class InterfaceExample2 {

	public static void main(String[] args) {
		Calculate calcu = new Calculate() {

			@Override
			public void sum(int num1, int num2) {
				System.out.println(num1 + num2);

			}

		};
		calcu.sum(3, 5);

		calcu = (a, b) -> {
			System.out.println(a * b);
		};
		calcu.sum(3, 5);
		Cal cal = (num) -> { // 람다식으로 표현한것

			int result = num * 2;
			System.out.println(result);

		};
		cal.multi(3);

	}

}
