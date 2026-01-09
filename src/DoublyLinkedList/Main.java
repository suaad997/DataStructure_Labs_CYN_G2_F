package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(2);
        dlist.addLast(5);
        dlist.addFirst(1);
        dlist.addLast(3);
        dlist.addFirst(6);
        dlist.addLast(7);
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();

    }
}
