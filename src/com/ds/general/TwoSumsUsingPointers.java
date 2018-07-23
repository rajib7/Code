package com.ds.general;

public class TwoSumsUsingPointers {

	public static void main(String args[]) {

		int[] numbers = { 1, 2, 3, 4, 5, 2 };
		int[] result = twoSum(numbers, 6);

		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
		}

	}

	public static int[] twoSum(int[] numbers, int target) {
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {

				j--;

			} else {

				return new int[] { i + 1, j + 1 };
			}

		}
		throw new IllegalArgumentException("No Sum Possible");
	}

}
