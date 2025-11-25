package stack;

import java.util.Stack;

public class StackReverse {
	public static Stack<Integer> ReverseStack (Stack<Integer> original) {
		Stack<Integer> temp = new Stack<Integer>();
		
		while(!original.isEmpty()) {
			temp.push(original.pop());
		}
		
		return temp;
	}
	public static void main(String[] args) {
		
		Stack<Integer 
		25853> stack = new Stack<>();
		stack.push(4);
		stack.push(8);
		stack.push(12);
		stack.push(16);
		System.out.println("Original Stack :"+stack);
		
		System.out.println("Reversed Stack: "+ReverseStack(stack));
	}

}
