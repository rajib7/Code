package com.ds.general;

public class TwoSumUsingHashSorted {

	public static void main(String args[]) {

		int[] numbers = { 2, 6, 6, 8, 9 };
		int[] result = twoSum(numbers, 8);
		for (int k = 0; k < result.length; k++) {

			System.out.println(result[k]);
		}

	}

	public static int[] twoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			int j = bSearch(numbers, target - numbers[i], i + 1);
			if (j != -1) {

				return new int[] { i + 1, j + 1 };
			}
		}

		throw new IllegalArgumentException("No Sum Possible");

	}

	private static int bSearch(int[] numbers, int key, int start) {
		int L = start, R = numbers.length - 1;
		while (L < R) {

			int M = (L + R) / 2;
			if (numbers[M] < key)
				L = M + 1;
			else {
				R = M;
			}
		}

		return (L == R && numbers[L] == key) ? L : -1;
	}

}
