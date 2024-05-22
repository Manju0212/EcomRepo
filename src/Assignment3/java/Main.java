package Assignment3.java;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(1, "Laptop", 1500.00, 10, "Electronics");
        
        Product product2 = new Product(2, "Smartphone", 800.00, 20, "Electronics");
        
        Product product3 = new Product(3, "Headphones", 150.00, 50, "Accessories");

        // Admin manages product list
        List<Product> productList = new ArrayList<>();
        
        Admin admin = new Admin(1, "admin_user", "admin123", "admin12@gmail.com", productList);
        
        admin.login();
        admin.addProduct(product1);
        admin.addProduct(product2);
        admin.addProduct(product3);
        
        System.out.println("Admin's product list after additions:");
        
        for (Product product : productList) {
            System.out.println(product.getProductDetails());
        }

        // Update a product
        Product updatedProduct1 = new Product(1, "Laptop", 2000.00, 8, "Electronics");
        admin.updateProduct(updatedProduct1);
        
        System.out.println("Admin's product list after update:");
        for (Product product : productList) {
            System.out.println(product.getProductDetails());
        }

        // Remove a product
        admin.removeProduct(product2);
        System.out.println("Admin's product list after removal:");
        
        for (Product product : productList) {
            System.out.println(product.getProductDetails());
        }
        admin.logout();

        // Customer interaction
        Customer customer = new Customer(2, "manju", "manju123", "manju12@gmail.com");
        
        customer.login();
        customer.addToCart(product1);
        customer.addToCart(product3);
        customer.viewProfile();

        // Placing an order
        Product[] orderedProducts = customer.getCart().toArray(new Product[0]);
        
        Order order = new Order(1, customer.getUserId(), new Date(), orderedProducts);
        
        order.placeOrder();
        order.trackOrder();
        System.out.println("Order details after placing:");
        
        System.out.println(order.getOrderDetails());

        // Customer checks out
        customer.checkout();
        customer.viewProfile();

        // Admin cancels the order
        admin.login();
        order.cancelOrder();
        order.trackOrder();
        System.out.println("Order details after cancellation:");
        
        System.out.println(order.getOrderDetails());
        admin.logout();

        customer.logout();
    }
}
