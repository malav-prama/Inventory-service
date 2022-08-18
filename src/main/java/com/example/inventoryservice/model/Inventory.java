package com.example.inventoryservice.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="inventory")
public class Inventory {
    private int productId;
    private ObjectId id;
    private int totalQuantity;

    public ObjectId getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "productId=" + productId +
                ", id=" + id +
                ", totalQuantity=" + totalQuantity +
                '}';
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
