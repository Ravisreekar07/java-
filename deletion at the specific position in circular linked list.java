class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
void deletePosition(int position) {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (position == 1) {
        deleteBeginning();
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

    if (temp.next == head) {
        System.out.println("Invalid position");
        return;
    }

    temp.next = temp.next.next;
}
