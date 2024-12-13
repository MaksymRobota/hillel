package app.linked_list_h6;


public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.add(2);
        head.add(3);
        head.add(4);

        printList(head);
        printList(head.reverse());

    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
