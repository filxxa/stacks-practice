public class ArrayStack implements Stack{
    private int Size;
    private Object a[];
    public ArrayStack(int capacity){
        a = new Object[capacity];
    }
    public int size(){
        return Size;
    }
    public Object peek(){
        return a[Size-1];
    }
    public void push(Object obj){
        if(Size == a.length){
            resize();
        }
        a[Size++] = obj;
    }
    public Object pop(){
        if(Size == 0) throw new IllegalStateException("Stack is empty");
        Object temp = a[--Size];
        a[Size] = null;
        return temp;
    }
    private void resize(){
        Object[] aa = a;
        a = new Object[2*aa.length];
        System.arraycopy(aa, 0, a, 0, Size);
    }
}