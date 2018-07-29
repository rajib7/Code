package com.ds.general;

public class GraphUsingList {

	int value;
	GraphUsingList next;
	GraphUsingList[] neighbours;
	boolean isVisited;

	GraphUsingList(int x) {

		value = x;
	}

	GraphUsingList(int x, GraphUsingList[] N) {

		value = x;
		neighbours = N;
	}

	public String toString() {

		return "value: " + this.value;
	}
}