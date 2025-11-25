package stack;

public class StackRecurrsion {

	public static void main(String[] args) {
		
		int[] stack = new int[4];
		int top=-1;
		
		top++;
		stack[top]=4;
		
		top++;
		stack[top]=8;
		
		top++;
		stack[top]=12;
		
		top++;
		stack[top]=16;
		
		printandPopRecurrsively(stack, top);
		
		
	}
	
	private static void printandPopRecurrsively(int[] stack, int top) {
		 if (top<0) {
			 System.out.println("Stack is empty!");
			 return;
		 }
		 
		 System.out.println("Latest Element: "+stack[top]);
		 printandPopRecurrsively(stack, --top);
	}

}
