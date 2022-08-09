package com.example.inventoryservice.dao;

import com.example.inventoryservice.model.*;
import com.example.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventoryDao {

    @Autowired
    InventoryRepository inventoryRepository;

    public void saveInventory(Inventory inventory)
    {
        inventoryRepository.save(inventory);
    }

    public void updateInventory(Inventory updateInventory)
    {
        inventoryRepository.save(updateInventory);
    }
    public Inventory getInventoryById(int productId){
        return inventoryRepository.findInventoryByProductId(productId);
    }
}
