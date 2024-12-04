package com.javierlnc.microservices.inventory.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javierlnc.microservices.inventory.inventory_service.module.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityIsGreaterThanEquals(String skuCode, Integer quantity);

}
