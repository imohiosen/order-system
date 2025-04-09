package com.moniepoint;

import java.util.Comparator;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public void addOrder(Order order) throws IllegalArgumentException {
        
    }

    @Override
    public Order getOrder(int orderId) {
        return null;
    }

    @Override
    public boolean removeOrder(int orderId) {
        return false;
    }

    @Override
    public boolean updateOrder(Order order) {
        return false;
    }

    @Override
    public List<Order> sortOrders(Comparator<Order> comparator) {
        return List.of();
    }
}
