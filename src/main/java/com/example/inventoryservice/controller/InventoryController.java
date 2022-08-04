package com.example.inventoryservice.controller;

import com.example.inventoryservice.logic.InventoryLogic;
import com.example.inventoryservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class InventoryController {

    @Autowired
    InventoryLogic inventoryLogic;

    @PostMapping("v2/inventory")
    public void createInventory(@RequestBody Inventory inventory)
    {
        inventoryLogic.createInventory(inventory);
    }

}
