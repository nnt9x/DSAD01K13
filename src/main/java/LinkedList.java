public class LinkedList {
    // Node head
    private Node head;
    // Kích thước
    private int size;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    // Thêm 1 phần tử vào đầu danh sách??
    public void addFirst(int data) {
        // Bước 1: Tạo node chứa dữ liệu
        Node tmp = new Node(data);
        // Buoc 2: Trỏ tmp-> head hiện tại
        tmp.setNext(head);
        // Buoc 3: Gan head hien tại -> tmp -> trở thành head mới
        head = tmp;
        // Bước 4: tăng size lên 1 đơn vị
        size++;
    }

    public void addLast(int data) {
        // Bước 1: Tạo node chứa dữ liệu mới
//        Node tmp = new Node(data);
        // Bước 2: cần tìm ra node cuối cùng ??
        if (size == 0) {
            addFirst(data);
            return;
        }
        // Size > 0
        Node tmp = new Node(data);

        Node node = head;
        for (int i = 0; i < size - 1; i++) {
            node = node.getNext();
        }
        // Sau vong lap nay co node cuoi
        // Bước 3: next -> tmp
        node.setNext(tmp);
        // Buoc 4: Tang size 1 don vi
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
        if (position > 0 && position < size) {
            // Chèn vào giữa ??
            // Làm thế nào để tìm tìm dc position -1 ??
            Node presviousPosition = head;
            for (int i = 0; i < (position - 1) - 1; i++) {
                presviousPosition = presviousPosition.getNext();
            }
            // Đã có postion -1 -> lấy ra node ở postion
            Node currentNode = presviousPosition.getNext();

            // Tạo node tmp mới
            Node tmp = new Node(data);
            presviousPosition.setNext(tmp);
            tmp.setNext(currentNode);
            // Tang size len 1 don vi
            size++;
        }
    }

    // Hiển thị
    public void display() {
        // In từ head -> đến Node có next = null (Node cuối)
        if (size == 0) {
            System.out.println("LinkedList is empty!");
            return;
        }
        Node node = head;
        do {
            System.out.print(node + "-->");
            node = node.getNext();
        }
        while (node != null);
        System.out.println();
    }
}
