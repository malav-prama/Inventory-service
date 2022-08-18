package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, Integer> {

        Inventory findInventoryByProductId(int productId);


}
