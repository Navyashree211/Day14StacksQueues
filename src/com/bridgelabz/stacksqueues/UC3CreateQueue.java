/**
 *  Ability to create a queue of 56 > 30 > 70 
 *  use LinkedList to do the Queue Operations  
 *  Here enqueue will internally call append methods on LinkedList.
 *  So 56 will be added first then 30 and 70 to make 56 on top of the stack.
 *  
 *  @author: Navya Shree
 *  @since: 12-10-2021
 */
package com.bridgelabz.stacksqueues;

public class UC3CreateQueue {

	public Node head;
	public Node tail;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// Append datas One By One
	public void append(int datas) {
		Node newNode = new Node(datas);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	// Display all the Node with value
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		UC3CreateQueue oparetionQueue = new UC3CreateQueue();
		oparetionQueue.append(70);
		oparetionQueue.append(30);
		oparetionQueue.append(56);

		oparetionQueue.display();
	}

}
