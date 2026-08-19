class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
void insertEnd(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        newNode.next = head;
        return;
    }

    Node temp = head;

    while (temp.next != head) {
        temp = temp.next;
    }

    temp.next = newNode;
    newNode.next = head;
}
