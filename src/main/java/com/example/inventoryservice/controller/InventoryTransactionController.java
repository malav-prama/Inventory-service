package com.example.inventoryservice.controller;

import com.example.inventoryservice.logic.InventoryTransactionLogic;
import com.example.inventoryservice.model.InventoryTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryTransactionController {

    @Autowired
    InventoryTransactionLogic inventoryTransactionLogic;

    @PostMapping("v2/InventoryTransaction")
    public void createInventoryTransaction(@RequestBody InventoryTransaction inventoryTransaction)
    {
        inventoryTransactionLogic.createInventoryTransaction(inventoryTransaction);
    }
    {

    }

}
