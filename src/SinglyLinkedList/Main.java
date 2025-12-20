package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
       SinglyLinkedList<Integer>  list=new SinglyLinkedList<Integer>();
       list.addlast(30);
       list.addlast(20);
       list.addlast(10);
       list.addlast(5);
       list.addAtPosition(40,3);
       //list.removeFirst();
       list.display();
    }
}
