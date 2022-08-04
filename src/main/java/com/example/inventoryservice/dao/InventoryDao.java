package com.example.inventoryservice.dao;

import com.example.inventoryservice.model.Inventory;
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


}
