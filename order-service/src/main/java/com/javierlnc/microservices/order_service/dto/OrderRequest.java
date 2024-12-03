package com.javierlnc.microservices.order_service.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderRequest {
    private String orderNumber;
    private String skuCode;
    private BigDecimal price;
    private  Integer quantity;
}
