
class Main {
    public static void main(String[] args) {
        Stack s1 = new LinkedStack();
        Stack s2 = new LinkedStack();
        Stack s3 = new LinkedStack();
        s1.push("eng"); s1.push("pf"); s1.push("isl");
        s2.push("dbs"); s2.push("dld"); s3.push("oop");
        s3.push("dsa"); s3.push("coal"); s3.push("ai");
        int size1 = s1.size(); int size2 = s2.size(); int size3 = s3.size();
        Stack t = new LinkedStack();
        for (int i=0; i<size1; i++){
            Object val = s1.pop();
            t.push(val);
        }
        for (int i=0; i<size2; i++){
            Object val = s2.pop();
            t.push(val);
        }
        for (int i=0; i<size3; i++){
            Object val = s3.pop();
            t.push(val);
        }
        System.out.println("1");
    }
}