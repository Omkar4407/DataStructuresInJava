package stack;

public class StackArraySafe {
	private int[] stack;
	private int top;
	
	public StackArraySafe(int size) {
		stack = new int[size];
		top=-1;
	}
	
	public void push(int value) {
		if (top==stack.length-1) {
			System.out.println("Overflow: Stack is full!");
			return;
		}
		top++;
		stack[top]=value;
	}
	
	public int pop() {
		if (top==-1) {
			System.out.println("Underflow: Stack is empty!");
			return -1;
		}
		int value = stack[top];
		top--;
		return value;
	}
	
	public int peek() {
		if (top==-1) {
			System.out.println("Underflow: Stack is empty!");
			return 0;
		}
		return stack[top];
	}
	
	public static void main(String[] args) {
		StackArraySafe s = new StackArraySafe(3);
		
		s.push(4);
		s.push(8);
		s.push(12);
		s.push(16);
 
		System.out.println("Latest Element: "+s.peek());
		
		System.out.println("Popped out: "+s.pop());
		System.out.println("Popped out: "+s.pop());
		System.out.println("Popped out: "+s.pop());
		System.out.println("Popped out: "+s.pop());

	}

}
