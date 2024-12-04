package com.javierlnc.microservices.inventory.inventory_service.dto;

import lombok.Data;

@Data
public class InventoryRequestDTO {
    private String skuCode;
    private Integer quantity;
}
