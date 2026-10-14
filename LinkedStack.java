public class LinkedStack implements Stack{
    private int Size;
    private Node top;
    public boolean isEmpty(){
        return (Size == 0);
    }
    public int size(){
        return Size;
    }
    public Object peek(){
        if (Size == 0) throw new IllegalStateException("Stack is Empty");
        return top.data;
    }
    public void push(Object obj){
        top = new Node(obj, top);
        ++Size;
    }
    public Object pop(){
        Object temp = top.data;
        top = top.next;
        --Size;
        return temp;
    }
    private static class Node{
        Object data;
        Node next;
        Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}