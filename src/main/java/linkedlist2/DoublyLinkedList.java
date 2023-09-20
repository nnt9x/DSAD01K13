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

    public void add(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }
        if (position == size) {
            addLast(data);
            return;
        }
        // Thêm vào giua -> cần tim position và position
        if (position > 0 && position < size) {
            // Chèn vào giữa ??
            // Làm thế nào để tìm tìm dc position -1 ??
            Node previousPosition = head;
            for (int i = 0; i < (position - 1); i++) {
                previousPosition = previousPosition.getNext();
            }
            // node postion
            Node currentNode = previousPosition.getNext();

            Node tmp = new Node(data);

            previousPosition.setNext(tmp);
            tmp.setPrevious(previousPosition);

            tmp.setNext(currentNode);
            currentNode.setPrevious(tmp);

            size ++;
        }
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
