package Assignment3.java;

import java.util.List;

public class Admin extends User {
    private List<Product> productList;

    public Admin(int userId, String username, String password, String email, List<Product> productList) {
        super(userId, username, password, email);
        this.productList = productList;
    }

    public void addProduct(Product product) {
        if (product != null) {
            productList.add(product);
            System.out.println(product.getProductName() + " added to product list.");
        } else {
            System.out.println("Product cannot be null.");
        }
    }

    public void removeProduct(Product product) {
        if (product != null && productList.contains(product)) {
            productList.remove(product);
            System.out.println(product.getProductName() + " removed from product list.");
        } else {
            System.out.println("Product not in product list or null.");
        }
    }

    public void updateProduct(Product product) {
        if (product != null) {
            boolean productFound = false;
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductId() == product.getProductId()) {
                    productList.set(i, product);
                    productFound = true;
                    System.out.println(product.getProductName() + " updated.");
                    break;
                }
            }
            if (!productFound) {
                System.out.println("Product not found in product list.");
            }
        } else {
            System.out.println("Product cannot be null.");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile:");
        System.out.println("UserID: " + getUserId());
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
    }

    @Override
    public void updateProfile() {
        System.out.println("Updating admin profile for " + getUsername());
        
    }
}
