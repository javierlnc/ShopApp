package com.javierlnc.microservices.inventory.inventory_service.service;

import org.springframework.stereotype.Service;

import com.javierlnc.microservices.inventory.inventory_service.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

}
