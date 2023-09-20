package linkedlist2;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node tmp = new Node(data);
        if (size == 0) {
            head = tmp;
            size++;
        } else if (size > 0) {
            tmp.setNext(head);
            head.setPrevious(tmp);
            head = tmp;
            size++;
        }
    }

    public void addLast(int data) {
        // Bước 1: ??
        if (size == 0) {
            addFirst(data);
            return;
        }
        Node tmp = new Node(data);
        // Tim ra node cuoi cung ??
        Node lastNode = head;
        for (int i = 0; i < size - 1; i++) {
            lastNode = lastNode.getNext();
        }
        // Da tim dc node cuoi ??
        lastNode.setNext(tmp);
        tmp.setPrevious(lastNode);
        // Tang size
        size++;
    }


    public void display() {
        if (size == 0) {
            System.out.println("DoublyLinkedList is empty!");
            return;
        }
        Node node = head;
        do {
            System.out.print(node + "< -- >");
            node = node.getNext();
        }
        while (node != null);
        System.out.print("NULL\n");

    }
}
