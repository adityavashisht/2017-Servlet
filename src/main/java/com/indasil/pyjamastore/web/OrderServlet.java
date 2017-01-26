package com.indasil.pyjamastore.web;

import com.indasil.pyjamastore.domain.Order;
import com.indasil.pyjamastore.service.OrderService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ady on 1/26/17.
 */
public class OrderServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String protocol = req.getProtocol();

        OrderService orderService = OrderService.getInstance();

        req.setAttribute("orders", orderService.getOrders());

        String nextJSP = "/orders.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(req,resp);


    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        OrderService orderService = OrderService.getInstance();

        String name = req.getParameter("orderName");

        Order order = new Order();
        order.setName(name);

        orderService.addOrder(order);

        req.setAttribute("orders", orderService.getOrders());
        String nextJSP = "/orders.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(req,resp);


    }




}
