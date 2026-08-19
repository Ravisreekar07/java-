class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
void insertPosition(int data, int position) {
    Node newNode = new Node(data);

    if (position == 1) {
        insertBeginning(data);
        return;
    }

    if (head == null) {
        System.out.println("Invalid position");
        return;
    }

    Node temp = head;

    for (int i = 1; i < position - 1; i++) {

        if (temp.next == head) {
            System.out.println("Invalid position");
            return;
        }

        temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}
