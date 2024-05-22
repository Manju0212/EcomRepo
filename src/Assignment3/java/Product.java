package Assignment3.java;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(int productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.setProductName(productName);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            System.out.println("Product name cannot be null or empty.");
        } else {
            this.productName = productName;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative.");
        } else {
            this.quantity = quantity;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null || category.isEmpty()) {
            System.out.println("Category cannot be null or empty.");
        } else {
            this.category = category;
        }
    }

    public String getProductDetails() {
        String details = "Product ID: " + productId + ", Name: " + productName + 
                         ", Price: " + price + ", Quantity: " + quantity + 
                         ", Category: " + category;
        return details;
    }

    public void updateQuantity(int newQuantity) {
        setQuantity(newQuantity);
    }

    public void updatePrice(double newPrice) {
        setPrice(newPrice);
    }
}
