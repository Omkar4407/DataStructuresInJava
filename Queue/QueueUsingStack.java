package PRAC3;

import java.util.*;

public class QueueUsingStack {
	
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public void enqueue(int data ) {
		s1.push(data);
	}
	
	public static int dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Stack is already empty!");
			return -1;
		}
		if(s2.empty()) {
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingStack j = new QueueUsingStack();
		
		j.enqueue(4);
		j.enqueue(8);
		j.enqueue(10);
		System.out.println(dequeue());
		j.enqueue(12);
		j.enqueue(16);
		
		System.out.println(dequeue());
		System.out.println(dequeue());

		


	}

}
