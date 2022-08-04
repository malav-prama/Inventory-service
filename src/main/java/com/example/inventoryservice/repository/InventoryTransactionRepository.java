package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.InventoryTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryTransactionRepository extends MongoRepository<InventoryTransaction, Integer> {
}
