package com.ds.general;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHash {

	public static void main(String args[]) {

		int[] numbers = { 2, 4, 5, 6, 7, 2, 6 };

		int[] result = twoSum(numbers, 7);
		for (int j = 0; j < result.length; j++) {

			System.out.println(result[j]);

		}

	}

	public static int[] twoSum(int[] numbers, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (map.containsKey(target - x)) {

				return new int[] { map.get(target - x) + 1, i + 1 };

			}
			map.put(x, i);
		}
		throw new IllegalArgumentException("No Sum exist");

	}

}
