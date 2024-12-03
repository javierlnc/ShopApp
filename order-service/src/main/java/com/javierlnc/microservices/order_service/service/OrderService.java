package com.javierlnc.microservices.order_service.service;

import com.javierlnc.microservices.order_service.dto.OrderRequest;
import com.javierlnc.microservices.order_service.module.Order;
import com.javierlnc.microservices.order_service.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public  void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(orderRequest.getOrderNumber());
        order.setSkuCode(orderRequest.getSkuCode());
        order.setQuantity(orderRequest.getQuantity());
        order.setPrice(orderRequest.getPrice());
        orderRepository.save(order);
    }
}
