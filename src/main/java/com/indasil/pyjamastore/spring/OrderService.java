package com.indasil.pyjamastore.spring;

import com.indasil.pyjamastore.domain.Order;

/**
 * Created by Ady on 1/29/17.
 */
public class OrderService { // Component


    // Used for sending email
    private EmailService emailService; // Collaborator

    // save to the db
    private OrderDao orderDao; // COllaborator

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void placeOrder(Order order) {
        // Save order in database
        // Send email

        orderDao.saveInDatabase(order);
        emailService.sendEmail(order);



    }
}
