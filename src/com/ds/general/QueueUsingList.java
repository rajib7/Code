package com.ds.general;

public class QueueUsingList {

	LinkedListDefinition first, last;

	public void enqueue(LinkedListDefinition n) {

		if (first == null) {

			first = n;

			last = first;
		} else {
			last.next = null;
			last = null;
		}

	}

	public LinkedListDefinition deQueue() {

		if (first == null)
			return null;
		else {

			LinkedListDefinition temp = new LinkedListDefinition(first.value);
			first = first.next;
			return temp;
		}
	}

}
