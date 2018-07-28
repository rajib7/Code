package com.ds.general;

public class StackUsingLinkedList {

	LinkedListDefinition top;

	public LinkedListDefinition peek() {
		if (top != null) {
			return top;

		}

		return null;

	}

	public LinkedListDefinition pop() {

		if (top == null) {

			return null;
		} else {

			LinkedListDefinition temp = new LinkedListDefinition(top.value);
			top = top.next;
			return temp;
		}

	}

	public void push(LinkedListDefinition n) {

		if (n != null) {

			n.next = top;
			top = n;
		}

	}
}
