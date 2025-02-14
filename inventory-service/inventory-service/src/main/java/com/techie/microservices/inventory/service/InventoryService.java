package com.techie.microservices.inventory.service;

import com.techie.microservices.inventory.model.Inventory;
import com.techie.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, int quantity) {
        //Find an inventory for a given skuCode where quantity >=0
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
