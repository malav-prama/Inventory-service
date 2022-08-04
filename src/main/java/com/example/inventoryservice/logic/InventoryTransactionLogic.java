package com.example.inventoryservice.logic;

import com.example.inventoryservice.dao.InventoryTransactionDao;
import com.example.inventoryservice.model.InventoryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class InventoryTransactionLogic {
    @Autowired
    InventoryTransactionDao inventoryTransactionDao;

    @Transactional
    public void createInventoryTransaction(InventoryTransaction inventoryTransaction)
    {
        inventoryTransactionDao.saveInventoryTransaction(inventoryTransaction);
    }
}
