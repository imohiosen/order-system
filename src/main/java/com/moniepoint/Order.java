package com.moniepoint;

import java.util.Date;

public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private Date orderDate;

    // Constructor
    public Order(int orderId, String customerName, double totalAmount, Date orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Order{" +
               "orderId=" + orderId +
               ", customerName='" + customerName + '\'' +
               ", totalAmount=" + totalAmount +
               ", orderDate=" + orderDate +
               '}';
    }
}
