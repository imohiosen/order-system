package com.moniepoint;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create repository instance.
        OrderRepository repository = new OrderRepositoryImpl();

        // Create some orders.
        Order order1 = new Order(1, "Alice", 100.0, new Date());
        // Pause a bit to create different timestamps.
        try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        Order order2 = new Order(2, "Bob", 150.0, new Date());
        try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        Order order3 = new Order(3, "Charlie", 120.0, new Date());

        // Add orders.
        repository.addOrder(order1);
        repository.addOrder(order2);
        repository.addOrder(order3);

        // Test getting an order.
        Order fetchedOrder = repository.getOrder(2);
        System.out.println("Fetched Order: " + fetchedOrder);

        // Test sorting orders by totalAmount descending.
        System.out.println("\nOrders sorted by totalAmount (descending):");
        List<Order> sortedByAmount = repository.sortOrders(Comparator.comparing(Order::getTotalAmount).reversed());
        for (Order o : sortedByAmount) {
            System.out.println(o);
        }

        // Test updating an order.
        System.out.println("\nUpdating order 3 total amount to 130.0");
        Order updatedOrder = new Order(3, "Charlie", 130.0, order3.getOrderDate());
        repository.updateOrder(updatedOrder);
        System.out.println("Updated Order 3: " + repository.getOrder(3));

        // Test removing an order.
        System.out.println("\nRemoving order 1");
        boolean removed = repository.removeOrder(1);
        System.out.println("Order 1 removed: " + removed);

        // Display remaining orders sorted by default (order date).
        System.out.println("\nRemaining orders (sorted by orderDate):");
        List<Order> sortedByDate = repository.sortOrders(null);
        for (Order o : sortedByDate) {
            System.out.println(o);
        }
    }
}