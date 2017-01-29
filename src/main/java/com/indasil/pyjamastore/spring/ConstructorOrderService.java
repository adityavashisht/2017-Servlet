package com.indasil.pyjamastore.spring;

import com.indasil.pyjamastore.domain.Order;

/**
 * Created by Ady on 1/29/17.
 */
public class ConstructorOrderService {

    // Used for sending email
    private EmailService emailService; // Collaborator

    // save to the db
    private OrderDao orderDao; // COllaborator

    public ConstructorOrderService(EmailService emailService, OrderDao orderDao) {
        this.emailService = emailService;
        this.orderDao = orderDao;
    }

    public void placeOrder(Order order) {
        System.out.println("Order via constructor");
        orderDao.saveInDatabase(order);
        emailService.sendEmail(order);
        System.out.println("Order placed");
    }
}
