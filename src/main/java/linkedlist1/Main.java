package linkedlist1;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(20);

        linkedList.display(); // 20->10

        linkedList.addLast(30);
        linkedList.display(); // 20->10->30


        linkedList.add(40, 2);
        linkedList.display(); // 20->10->40->30




    }
}
