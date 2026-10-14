public class Main {
    public static void main(String[] args) {
        Stack s1 = new LinkedStack();
        Stack s2 = new LinkedStack();
        Stack s3 = new LinkedStack();
        Stack[] stacks = {s1, s2, s3};
        String[] subjects = {"eng", "pf", "isl", "dbs", "dld", "oop", "dsa", "coal", "ai"};

        for (int i = 0; i < subjects.length; i++) {
            stacks[i / 3].push(subjects[i]);
        }
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
       System.out.println("abc");
        }
    } 

