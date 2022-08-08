package com.example.inventoryservice.logic;

import com.example.inventoryservice.dao.InventoryDao;
import com.example.inventoryservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InventoryLogic {

    @Autowired
    InventoryDao inventoryDao;

    @Transactional
    public void createInventory(Inventory inventory)
    {
        inventoryDao.saveInventory(inventory);
    }

    public Inventory getInventoryById(int productId) {
        return inventoryDao.getInventoryById(productId);
    }
}
