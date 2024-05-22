package Assignment3.java;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Product> cart;

    public Customer(int userId, String username, String password, String email) {
        super(userId, username, password, email);
        this.cart = new ArrayList<>();
    }

    public List<Product> getCart() {
        return cart;
    }

    public void addToCart(Product product) {
        if (product != null) {
            cart.add(product);
            System.out.println(product.getProductName() + " added to cart.");
        } else {
            throw new IllegalArgumentException("Product cannot be null");
        }
    }

    public void removeFromCart(Product product) {
        if (product != null && cart.contains(product)) {
            cart.remove(product);
            System.out.println(product.getProductName() + " removed from cart.");
        } else {
            throw new IllegalArgumentException("Product not in cart or null");
        }
    }

    public void checkout() {
        System.out.println("Checking out the following items:");
        for (Product product : cart) {
            System.out.println(product.getProductDetails());
        }
        cart.clear();
        System.out.println("Checkout complete.");
    }

    @Override
    public void viewProfile() {
        System.out.println("Customer Profile:");
        System.out.println("UserID: " + getUserId());
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("Cart: " + cart.size() + " items");
    }

    @Override
    public void updateProfile() {
        System.out.println("Updating customer profile for " + getUsername());
  
    }
}
