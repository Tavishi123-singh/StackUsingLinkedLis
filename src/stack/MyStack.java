package stack;

public class MyStack {
    Node head;
    int size;
    public MyStack(){
        head=null;
        size=0;
    }
    public void push(int element){
        Node node=new Node(element);
        node.setNext(head);
        head=node;
        size++;
    }
    public Node pop(){
        Node res=null;
        if (!isEmpty()){
            res=head;
            size--;
            head=head.getNext();
        }
        else {
            System.out.println("Stack is Underflow");
        }
        return res;
    }

    public boolean isEmpty() {
        boolean res=false;
        if (head==null){
            res=true;
        }
        return res;
    }
    public Node peek(){
        Node res=null;
        if(!isEmpty()){
            res=head;
        }
        else {
            System.out.println("Stack is Underflow");
        }
        return res;
    }
}
