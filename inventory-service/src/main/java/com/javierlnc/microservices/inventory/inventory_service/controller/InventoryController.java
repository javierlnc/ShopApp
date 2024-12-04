package com.javierlnc.microservices.inventory.inventory_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.javierlnc.microservices.inventory.inventory_service.dto.InventoryRequestDTO;
import com.javierlnc.microservices.inventory.inventory_service.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean checkInventory(@RequestBody InventoryRequestDTO dto) {
        try {
            return inventoryService.isInStock(dto);
        } catch (Exception e) {
            return false;
        }
    }
}
