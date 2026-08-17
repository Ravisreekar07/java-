class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}class Main{
    static Node deleteNode(Node head, int x){
        if(head == null) return null;
        Node curr = head;
        head = head.next;
        curr=null;
        return head;
    }
    static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null) System.out.print("->");
        }
          curr = curr.next;
    }
} pubic static void main(String[] args){
    Node head = new Node(8);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(1);
    head.next.next.next.next = new Node(7);
    head=deleteNode(head);
    printList(head);
}

