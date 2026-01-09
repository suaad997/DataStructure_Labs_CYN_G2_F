package Stack;

public class Main {
    public static void main(String[] args) {
        SlinkedStack<Integer> lstack= new SlinkedStack<Integer>();
        DlinkedStack<Integer> dlStack=new DlinkedStack<Integer>();
        ArrayStack<Integer> aStack=new ArrayStack<Integer>(2);
        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        System.out.println("top is: "+aStack.top());
        while (!aStack.isEmpty()){
            System.out.println("element removed="+aStack.pop());
        }

//        lstack.push(10);
//        lstack.push(20);
//        lstack.push(40);
//        lstack.push(50);
//        while (!lstack.isEmpty()){
//            System.out.println(lstack.pop());
//        }
//        dlStack.push(10);
//        dlStack.push(20);
//        dlStack.push(40);
//        dlStack.push(50);
//      //  System.out.println(dlStack.top());
//        System.out.println(dlStack.pop());
//        System.out.println(dlStack.pop());
//        System.out.println(dlStack.pop());
//        System.out.println(dlStack.pop());



    }
}
