package com.javierlnc.microservices.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequestDTO {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
