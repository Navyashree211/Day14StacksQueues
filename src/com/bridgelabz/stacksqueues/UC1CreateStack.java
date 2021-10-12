/**
* To create a stack of 56>30>70
 * use LinkedList to do stack operations.
 * Here push will internally call add method on LinkedList.
 *  So 70 will be added first then 30 and then 56 to make 56 on top of the Stack.
 *  
 *  @author: Navya Shree
 *  @since: 12-10-2021
 */
package com.bridgelabz.stacksqueues;

public class UC1CreateStack {   
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

	// pushing new datas
	public void push(int datas) {
		Node newNode = new Node(datas);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// Display all Node with Value
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
		}
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		UC1CreateStack operationStack = new UC1CreateStack();
		operationStack.push(70);
		operationStack.push(30);
		operationStack.push(56);

		operationStack.display();
	}

}
