package com.yedam.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
	public static List<Student> List = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : List) {
			System.out.println(func.apply(student));
		}
	}

//								Function<Student,Integer> func
	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : List) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToDoubleFunction<Student> func) {
		double result = 0, sum = 0;
		for (Student student : List) {
			result = func.applyAsDouble(student);
			sum += result;

		}
		return sum / List.size();

	}

	public static void main(String[] args) {
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>() {

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); // int -> double

			}

		});
		System.out.println("result: " + avg);

		System.out.println("[합계점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore() + value.getMathScore();

			}

		});

		System.out.println(func.apply("Hello"));
		BiFunction<String, String, Integer> biFunc = null;

		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}

		});
		System.out.println("[학생이름-영어점수]");
		printString(new Function<Student, String>() {

			@Override
			public String apply(Student t) {
				return t.getName() + "-" + t.getEngScore();

			}

		});

		Function<String, Integer> func = null;
		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();

			}

		};
	}
}