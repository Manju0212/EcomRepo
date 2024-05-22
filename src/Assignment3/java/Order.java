package Assignment3.java;

import java.util.Date;

public class Order implements OrderActions {
    private int orderId;
    private int customerId;
    private Date orderDate;
    private String orderStatus;
    private Product[] orderedProducts;

    public Order(int orderId, int customerId, Date orderDate, Product[] orderedProducts) {
        this.orderId = orderId;
        this.customerId = customerId;
        
        this.orderDate = orderDate;
        
        if (orderedProducts != null) {
            this.orderedProducts = orderedProducts;
        } else {
            this.orderedProducts = new Product[0];
        }
        this.orderStatus = "Pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Product[] getOrderedProducts() {
        return orderedProducts;
    }

    @Override
    public void placeOrder() {
        if (orderedProducts.length == 0) {
            System.out.println("Order cannot be placed. No products in the order.");
            return;
        }
        orderStatus = "Placed";
        System.out.println("Order placed successfully. Order ID: " + orderId);
    }

    @Override
    public void cancelOrder() {
        if (!orderStatus.equals("Placed")) {
            System.out.println("Order cannot be canceled. Current status: " + orderStatus);
            return;
        }
        orderStatus = "Canceled";
        System.out.println("Order ID " + orderId + " has been canceled.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking order ID " + orderId + ". Current status: " + orderStatus);
    }

    public void updateOrderStatus(String status) {
        if (status == null || status.isEmpty()) {
            System.out.println("Status cannot be null or empty.");
        } else {
            this.orderStatus = status;
        }
    }

    public String getOrderDetails() {
        String details = "Order ID: " + orderId
                       + ", Customer ID: " + customerId
                       + ", Order Date: " + orderDate
                       + ", Order Status: " + orderStatus
                       + ", Products: ";
        for (Product product : orderedProducts) {
            details += "\n  " + product.getProductDetails();
        }
        return details;
    }
}
