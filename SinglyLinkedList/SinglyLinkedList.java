package SinglyLinkedList;

public class SinglyLinkedList {
    Node head;

    public void createSinglyLinkedList(int data) {
        Node temp = new Node(data);
        head.next = temp;
    }

    public void traverseSinglyLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}