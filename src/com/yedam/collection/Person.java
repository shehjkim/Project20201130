package com.yedam.collection;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Person P = (Person) obj;
		boolean result = this.name.equals(P.name);
			return this.name.equals(obj);
	}

}
