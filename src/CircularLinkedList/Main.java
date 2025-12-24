package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> clist =new CircularLinkedList<String>();
        clist.addFirst("Afnan");
        clist.addFirst("Nada");
        clist.addLast("Asmaa");
        clist.addLast("Sarah");
        clist.addFirst("Huda");
        clist.removeLast();
        clist.removeFirst();
        clist.display();
    }
}
