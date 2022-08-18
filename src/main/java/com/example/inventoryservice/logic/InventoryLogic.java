package com.example.inventoryservice.logic;

import com.example.inventoryservice.dao.InventoryDao;
import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
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
    @Autowired
    InventoryRepository inventoryRepository;


    @Transactional
    public void createInventory(Inventory inventory)
    {
        inventoryDao.saveInventory(inventory);
    }

    public Inventory getInventoryById(int productId) {
        return inventoryDao.getInventoryById(productId);
    }







        public ResponseEntity<?> updateInventory (updateInventory updateInventory)
        {
            System.out.println(updateInventory);

            Inventory inventory = inventoryRepository.findInventoryByProductId(updateInventory.getProductId());
            System.out.println(inventory);
            if (inventory != null) {

                int currentQty = inventory.getTotalQuantity();
                if (currentQty >= updateInventory.getProductQty()) {
                    int updateQTY = currentQty - updateInventory.getProductQty();
                    inventory.setTotalQuantity(updateQTY);
                    inventoryDao.updateInventory(inventory);
                    return ResponseEntity.status(202).build();
                } else {
                    return ResponseEntity.status(406).build();
                }

            } else {
                return ResponseEntity.status(400).build();
            }


        }



}
