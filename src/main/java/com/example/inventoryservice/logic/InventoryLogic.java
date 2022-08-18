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



    public ResponseEntity<?> updateInventory(updateInventory updateInventory)
    {

        Inventory inventory=inventoryRepository.findInventoryByProductId(updateInventory.getProductId());
        System.out.println(inventory);
        if(inventory!=null){

            int currentQty=inventory.getTotalQuantity();
            if(currentQty>=updateInventory.getProductQty()) {
                int updateQTY = currentQty - updateInventory.getProductQty();
                inventory.setTotalQuantity(updateQTY);
                inventoryDao.updateInventory(inventory);
                return ResponseEntity.status(202).build();
            }
            else {
                return ResponseEntity.status(406).build();
            }

        }
        else {
             return ResponseEntity.status(400).build();
        }






    }


>>>>>>> Stashed changes
}
