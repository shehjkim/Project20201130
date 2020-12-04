package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;

	public Fruit() { // 생성자

	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public String getName() { // source-getter만 생성
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
//		return this.name.hashCode() + this.price; //이름이 같고 가격이 같으면 리턴되는값은 같음
		return this.name.length() + this.price;	//문자열이 같고 가격이 같은면 동일한 객체로 출력된다
	}

	@Override
	public boolean equals(Object obj) {
//		Object obj => Fruit 클래스로 casting
		Fruit fruit = (Fruit) obj;
//		return this.name.equals(fruit.name) 
//				&& this.price == fruit.price;//이름,가격이 같으면 논리적으로 동일한 객체 입니다
//		return super.equals(obj);
		boolean b1 = this.name.length() == fruit.name.length();
		boolean b2 = this.price == fruit.price;
		return b1 && b2;

	}
}
