package com.example.inventoryservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="inventory")
public class Inventory {
    private int productId;
    private int totalQuantity;


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
