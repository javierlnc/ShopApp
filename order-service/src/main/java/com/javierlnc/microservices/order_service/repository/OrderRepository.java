package com.javierlnc.microservices.order_service.repository;

import com.javierlnc.microservices.order_service.module.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
