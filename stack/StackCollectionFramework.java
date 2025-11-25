package stack;

import java.util.Stack;

public class StackCollectionFramework {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("Janvvi");
		s.push("Omkar");
		s.push("Dakshesh");
		s.push("Chaitanya");
;
		
		while (!s.empty()) {
			System.out.println("Latest Element: "+s.peek());
			System.out.println("Popped out: "+s.pop());

		}
		
		if (s.empty()) {
			System.out.println("Stack is already empty!");
		}
		
	}

}
