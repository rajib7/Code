package com.ds.general;

import java.util.HashMap;
import java.util.Map;

public class CheckingValuesUsingHashMap {

	private Map<Integer, Integer> tables = new HashMap<>();

	public void add(int input) {

		int count = tables.containsKey(input) ? tables.get(input) : 0;
		tables.put(input, count + 1);
	}

	public boolean find(int val) {

		for (Map.Entry<Integer, Integer> entry : tables.entrySet()) {

			int num = entry.getKey();

			int y = val - num;
			if (y == num) {
				if (entry.getValue() >= 2)
					return true;
			}

			else if (tables.containsKey(y)) {

				return true;
			}

		}
		return false;

	}

}
