package SinglyLinkedList;

public class Product {
    private int id;
    private String productName;
    private String productCode;
    private double price;

    Product() {

    }

    Product(int id, String productName, String productCode, 
    double price) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", price="
                + price + "]";
    }

    
    
}