/**
 *  Ability to dequeue from the beginning.
 *  Use LinkedList to do the Queue Operation.
 *  
 *  @author: Navya Shree
 *  @since: 12-10-2021
 */
package com.bridgelabz.stacksqueues;

public class UC4DequeueFromBeginning {   
		
	public Node head;
	public Node tail;
	static class Node  {
		int data;
		Node next;
		
		Node(int data)  {
			this.data = data;
			next = null;
		}
	}
	//Append datas One By One
	public void append(int datas)  {
		Node newNode = new Node(datas);
		if(head == null)  {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	//Display all the Node with value 
	public void display()  {
		Node current = head;
		if(head == null)  {
			System.out.println("List is Empty");
		}
		while (current != null)  {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
		//Dequeue all the elements
		public void dequeue()  {
			Node current = head;
			while (current != head)  {
				if(current == head)  {
				head = head.next;
				current = head;
			}
		}
		
	}
	public static void main(String[] args) {
		UC4DequeueFromBeginning oparetionQueue = new UC4DequeueFromBeginning();
		oparetionQueue.append(70);
		oparetionQueue.append(30);
		oparetionQueue.append(56);
		
		oparetionQueue.display();
	}
}
