import java.util.*;

class Work {
    int top, max = 100;
    int a[] = new int[100];

    boolean isEmpty() {
        return (top < 0);
    }
    
    Work() {
        top = -1;
    }
    
    boolean push(int x) {
        if (top >= (max - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
}

public class StackQueue {
    public static void main(String[] args) {
        char a;
        int num;
        Work w = new Work();
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Enter the choice");
            System.out.println("1. For push");
            System.out.println("2. For pop");
            System.out.println("3. For exit");
            
            int x = scn.nextInt();
            
            switch(x) {
                case 1: {
                    System.out.println("Enter the number: ");
                    num = scn.nextInt();
                    w.push(num);
                    System.out.println(num + " is pushed");
                    break;
                }
                
                case 2: {
                    System.out.println("Number " + w.pop() + " is poped");
                    break;
                }
                    
                    default: {
                    System.out.println("Please enter right input");
                }   
            }
            System.out.println("Continue(Y/N)");
            a = scn.next().charAt(0);
        } while(a == 'Y' || a == 'y');
    }
}

