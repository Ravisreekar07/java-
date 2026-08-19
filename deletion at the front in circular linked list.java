class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
void deleteBeginning() {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.next == head) {
        head = null;
        return;
    }

    Node temp = head;

    while (temp.next != head) {
        temp = temp.next;
    }

    head = head.next;
    temp.next = head;
}
