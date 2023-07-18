package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sLL = 
            new SinglyLinkedList<Integer>();
        sLL.createSinglyLinkedList(1);
        sLL.traverseSinglyLinkedList();

        SinglyLinkedList<String> sLL2 = 
            new SinglyLinkedList<String>();
        sLL2.createSinglyLinkedList("Hello");
        sLL2.traverseSinglyLinkedList();


        SinglyLinkedList<Product> products = new SinglyLinkedList<Product>();
        Product product = new Product(1, "iPhone 14 Pro",
             "iphone_14_pro", 1200);
        products.createSinglyLinkedList(product);
        products.traverseSinglyLinkedList();
    }

}