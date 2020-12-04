package com.yedam.generic;

public class Box<T> {


	T obj;									//object 타입으로 필드 선언
	void set(T obj) {						//get,set 메소드로 값을 가져오는걸 만듦
		this.obj=obj;							//object는 모든 타입을 다 가질수있음
		
	}
	T get() {
		return obj;
	}
}
