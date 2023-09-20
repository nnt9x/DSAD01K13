package linkedlist2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.display();
        linkedList.addLast(30);
        linkedList.display(); // 20 10 30

        linkedList.add(0, 0);
        linkedList.display();
        linkedList.add(40, 4);
        linkedList.display(); // 0 20 10 30 40
        linkedList.add(50, 3); // 0 20 10 50 30 40
        linkedList.display();

    }
}
