package com.javierlnc.microservices.order_service.service;

import com.javierlnc.microservices.order_service.dto.OrderRequest;
import com.javierlnc.microservices.order_service.model.Order;
import com.javierlnc.microservices.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public  void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
         orderRepository.save(order);
    }
}
