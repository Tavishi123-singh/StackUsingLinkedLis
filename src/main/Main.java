/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package main;

import stack.MyStack;
import stack.Node;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyStack obj=new MyStack();
        obj.peek();
        obj.pop();
        System.out.println("Size of Stack: "+obj.size());
        obj.push(100);
        Node ele=obj.peek();
        System.out.println(ele.getData());
        System.out.println("Size of Stack: "+obj.size());
        for (int i = 0; i <150 ; i++) {
            obj.push(new Random().nextInt(100));
        }
        System.out.println("Size of Stack: "+obj.size());
        for (int i = 0; i <10 ; i++) {
            Node del=obj.pop();
            if(del!=null){
                System.out.print(del.getData() +",");
            }
        }
    }
}
