package com.indasil.pyjamastore.service;

import com.indasil.pyjamastore.domain.Order;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Ady on 1/26/17.
 */
public class OrderService {

    private static final OrderService orderService = new OrderService();
    private static final ConcurrentHashMap<Long, Order> orderMap = new ConcurrentHashMap<Long, Order>();

    private OrderService() {

    }

    public static OrderService getInstance() {
        return orderService;
    }

    public Collection<Order> getOrders() {
        return orderMap.values();

    }

    public void addOrder(Order order) {
        Set<Long> keys = orderMap.keySet();
        int size = keys.size();
        order.setId(Long.valueOf(++size));

        orderMap.put(order.getId(), order);

    }
}
