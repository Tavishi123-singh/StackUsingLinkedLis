package infixTopostfix;

import stack.MyStack;

import java.util.Scanner;

public class InFixToPostFixByStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String expression=sc.nextLine();
    }
    public String convertToPostFix(String expression){
        String res="";
        MyStack obj=new MyStack();
        for (int i = 0; i <expression.length() ; i++) {
            char c=expression.charAt(i);
        }
        return res;
    }
}
