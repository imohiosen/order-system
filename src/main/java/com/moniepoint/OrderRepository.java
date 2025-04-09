package com.moniepoint;

import java.util.Comparator;
import java.util.List;

public interface OrderRepository {

    /**
     * Adds a new Order to the repository.
     *
     * @param order the Order to add.
     * @throws IllegalArgumentException if an order with the same ID already exists.
     */
    void addOrder(Order order) throws IllegalArgumentException;

    /**
     * Retrieves an Order by its ID.
     *
     * @param orderId the unique identifier of the Order.
     * @return the Order with the specified ID, or null if no such Order exists.
     */
    Order getOrder(int orderId);

    /**
     * Removes an Order by its ID.
     *
     * @param orderId the unique identifier of the Order.
     * @return true if the Order was successfully removed, false otherwise.
     */
    boolean removeOrder(int orderId);

    /**
     * Updates an existing Order. The implementation should update the Order identified
     * by order.getOrderId() with the information provided in the passed Order instance.
     *
     * @param order an Order instance with updated fields.
     * @return true if the update was successful, false if no Order with the provided ID exists.
     */
    boolean updateOrder(Order order);

    /**
     * Returns a sorted list of Orders based on the provided Comparator. If the comparator
     * is null, a default sorting order (e.g., by order date) should be used.
     *
     * @param comparator the Comparator used to sort the Orders.
     * @return a sorted List of Orders.
     */
    List<Order> sortOrders(Comparator<Order> comparator);
}
