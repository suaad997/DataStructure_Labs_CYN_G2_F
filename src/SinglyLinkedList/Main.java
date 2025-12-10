package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
       SinglyLinkedList<Integer>  list=new SinglyLinkedList<Integer>();
       list.addlast(30);
       list.addlast(20);
       list.addFirst(10);
       list.addFirst(5);
       list.removeFirst();
       list.display();
    }
}
