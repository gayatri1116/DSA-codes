//add new node in linkedlist at first
public class linkedlist1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        if (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]) {
        linkedlist1 ll = new linkedlist1();
        ll.print();
        ll.AddFirst(1);
        ll.print();
        ll.AddFirst(2);
        ll.print();
        ll.AddFirst(3);
        ll.print();
        // ll.AddFirst(2);

    }
}