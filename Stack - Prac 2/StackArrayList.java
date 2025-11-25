package stack;

import java.util.ArrayList;

public class StackArrayList {
	ArrayList<Integer> stack;
	
	public StackArrayList() {
		stack  = new ArrayList<>();
	}
	
	public int push(int value) {
		stack.add(value);
		return stack.get(stack.size()-1);
	}
	
	public int pop() {
		if (stack.isEmpty()) {
			System.out.println("Stack is already Empty!");
			return -1;
		}
		return stack.remove(stack.size()-1);
	}
	
	public int peek() {
		if (stack.isEmpty()) {
			System.out.println("Stack is already Empty!");
			return -1;
		}
		return stack.get(stack.size()-1);
	}
	
	public static void main(String[] args) {
		StackArrayList s = new StackArrayList();
		
			System.out.println("Peeked: "+s.push(1));
			System.out.println("Peeked: "+s.push(4));
			System.out.println("Peeked: "+s.push(44));
			
			System.out.println("Peeked: "+s.peek());
			
			System.out.println("Peeked: "+s.pop());
			System.out.println("Peeked: "+s.pop());
			System.out.println("Peeked: "+s.pop());
			System.out.println("Peeked: "+s.pop());


	}

}
