package com.example.inventoryservice.controller;

import com.example.inventoryservice.logic.InventoryLogic;
import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory/v2")
public class InventoryController {

    @Autowired
    InventoryLogic inventoryLogic;

    @PostMapping("/inventory")
    public void createInventory(@RequestBody Inventory inventory)
    {
        inventoryLogic.createInventory(inventory);
    }

    @GetMapping()
    public Inventory getInventoryById(@RequestParam("productId") int productId){
        return inventoryLogic.getInventoryById(productId);
    }

<<<<<<< HEAD

    @PostMapping("/checkInventory")
    public ResponseEntity checkInventory(@RequestBody InventoryCheck inventoryCheck)

    @PutMapping("/updateInventory")
    public void updateInventory( @RequestBody updateInventory updateInventory)

=======
    @PutMapping("/updateInventory")
    public void updateInventory(@RequestBody updateInventory updateInventory)
>>>>>>> updatedInventoryLogic
    {

        inventoryLogic.updateInventory(updateInventory);

    }




}
