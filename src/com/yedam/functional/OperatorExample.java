package com.yedam.functional;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	// 필드
	static int[] scores = { 92, 95, 87 }; // 필드가 메인메소드에 사용되려면 static 선언

	static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	// 메인 메소드
	public static void main(String[] args) {
		int maxValue = maxOrMin(new IntBinaryOperator() {
			// 최대값
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ",right: " + right);
				return left > right ? left : right;

			}

		});
		System.out.println("제일 큰 값: " + maxValue);

		// 최소값
		int minValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ",right: " + right);
				return left > right ? right : left;

			}

		});
		System.out.println("제일 작은 값: " + minValue);
	}

}
