package linkedlist2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.display();
        linkedList.addLast(30);
        linkedList.display();
    }
}
