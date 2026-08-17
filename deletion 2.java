public class Main{
    public static Node deleteNode(Node head, int x) {
        ArrayList<Node> nodes = new ArrayList<>();
        Node current = head;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }if (x==1){
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }
        Node prev = nodes.get(x - 2);
        Node toDelete = nodes.get(x - 1);
        prev.next = deleteNode.next;
        deleteNode = null;
        return head;
        public static void printList(Node head) {
            while (head != null) {
                System.out.print(head.data);
                if (head.next != null) 
                    System.out.print(" -> ");
                head = head.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Node head = new Node(2);
            head.next = new Node(5);
            head.next.next = new Node(7);
            head.next.next.next = new Node(8);
            head.next.next.next.next = new Node(99);
            head.next.next.next.next.next = new Node(100);
            int x = 6; // Position of the node to be deleted
            head = deleteNode(head, x);
            printList(head);
        }
}