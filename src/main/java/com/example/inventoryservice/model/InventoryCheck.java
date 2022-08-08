package com.example.inventoryservice.model;

public class InventoryCheck {
    private int productID;
    private int desiredQty;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getDesiredQty() {
        return desiredQty;
    }

    public void setDesiredQty(int desiredQty) {
        this.desiredQty = desiredQty;
    }
}
