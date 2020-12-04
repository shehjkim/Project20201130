package com.yedam.interfaces;

interface MyFunctionalinterFace {
	public void multi(int num1);

}

//1.화면출력 ( 원의 넓이를 구하는 기능 구현)
//2.화면출력 ( 밑변으로 가지는 정삼각형의 넓이를 구하는 기능)
//3.화면출력 (정사각형 넓이를 구하는 기능 구현)

public class InterfaceExample3 {
	public static void main(String[] args) {
		MyFunctionalinterFace fun = new MyFunctionalinterFace() {

			@Override
			public void multi(int num1) {
			}

		};
//원의넓이		
		fun = (a) -> {
			System.out.println("원의 넓이는: " + (a * a) * Math.PI);			//Math.PI = 3.14
		};
		fun.multi(5);

//정삼각형 넓이	
		fun = (b) -> {
			System.out.println("정삼각형의 넓이는: " + (b * b) * 1.74 * 4);
		};
		fun.multi(9);
//정사각형 넓이
		fun = (c) -> {
			System.out.println("정사각형의 넓이는: " + c * c);
		};
		fun.multi(10);

	}
}