package com.example.inventoryservice.logic;

import com.example.inventoryservice.dao.InventoryDao;
import com.example.inventoryservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.inventoryservice.model.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    public ResponseEntity<?> updateInventory(updateInventory updateInventory)
    {
        Inventory inventory=inventoryDao.getInventoryById(updateInventory.getProductId());

        int currentQty=inventory.getTotalQuantity();
        if(currentQty>0) {
            int updateQTY = currentQty - updateInventory.getProductQty();
            inventory.setTotalQuantity(updateQTY);
            inventoryDao.updateInventory(inventory);
            return ResponseEntity.status(200).build();
        }
        else {
            return ResponseEntity.status(406).build();
        }


    }


}
