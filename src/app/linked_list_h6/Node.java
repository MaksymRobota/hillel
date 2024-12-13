package app.linked_list_h6;

public class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    public void add(int value) {
        if (this.next == null) {
            this.next = new Node(value);
        } else {
            this.next.add(value);
        }
    }

    public Node reverse() {
        return reverse(null);
    }

    public Node reverse(Node head) {
        Node oldNext = this.next;
        this.next = head;
        if (oldNext == null) {
            return this;
        }
        return oldNext.reverse(this);
    }
}
