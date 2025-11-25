package stack;

import java.util.Scanner;

public class BalancedExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String exp = sc.nextLine();

        char stack[] = new char[exp.length()];
        int top = -1;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }

            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (top == -1) {
                    System.out.println("Not Balanced");
                    return;
                }

                char last = stack[top--]; // pop

                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {

                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        if (top == -1) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
