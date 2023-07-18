package SinglyLinkedList;

public class SinglyLinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size;
  
    public Node<T> createSinglyLinkedList(T nodeValue) {
      head = new Node<T>();
      Node<T> node = new Node<T>();
      node.next = null;
      node.value = nodeValue;
      head = node;
      tail = node;
      size = 1;
      return head;
    }

    public void traverseSinglyLinkedList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }
}