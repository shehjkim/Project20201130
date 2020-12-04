package com.yedam.interfaces;

public class InterfaceExample4 {

	public static void main(String[] args) {
		Myinterface mi = null;    //mi에 담겨지는 익명 객체
	mi = (a , b) -> a + b;											//변수는 a,b num1,num2 원하느것 쓰면됨
	int result = mi.run(10,20);
	
	
	mi= (num1,num2) -> num1  * num2;
	result = mi.run(5, 10) ;
	
	// 두개의 변수(직사각형의 가로, 세로) -> 넓이는 기능 구현
	mi = (x , y) -> x * y;
	result = mi.run(10, 12);
		
	
	
	System.out.println("결과값: " + result);
	}

}
