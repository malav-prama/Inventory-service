package com.example.inventoryservice.dao;

import com.example.inventoryservice.model.InventoryTransaction;
import com.example.inventoryservice.repository.InventoryTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventoryTransactionDao {

    @Autowired
    InventoryTransactionRepository inventoryTransactionRepository;

    public void saveInventoryTransaction(InventoryTransaction inventoryTransaction)
    {
        inventoryTransactionRepository.save(inventoryTransaction);
    }
}
