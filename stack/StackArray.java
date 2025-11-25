package stack;

public class StackArray {

	public static void main(String[] args) {
		int[] stack = new int[5];
        int top = -1;

        //push operations
        top++;
        stack[top]=10;

        top++;
        stack[top]=20;

        top++;
        stack[top]=30;

        while(top>-1) //iterates inside the stack 
        {
            System.out.println("Latest Element: "+stack[top]); //peek an element
            top--; //pop the peeked element
        }

        System.out.println("The Stack is now empty!");
	}

}
