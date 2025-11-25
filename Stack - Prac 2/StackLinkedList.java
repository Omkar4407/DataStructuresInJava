package stack;

import java.util.LinkedList;

public class StackLinkedList {
    LinkedList<Integer> stack;
    
    public StackLinkedList() {
        stack = new LinkedList<>();
    }
    
    public int push(int value) {
        stack.addLast(value);
        return stack.getLast();
    }
    
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is already Empty!");
            return -1;
        }
        return stack.removeLast();
    }
    
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is already Empty!");
            return -1;
        }
        return stack.getLast();
    }
    
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        
        System.out.println("Pushed: " + s.push(1));
        System.out.println("Pushed: " + s.push(4));
        System.out.println("Pushed: " + s.push(44));
        
        System.out.println("Peeked: " + s.peek());
        
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
    }
}
