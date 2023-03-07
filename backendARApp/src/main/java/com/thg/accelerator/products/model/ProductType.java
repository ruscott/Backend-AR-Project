package com.thg.accelerator.products.model;

public enum ProductType {
    TABLE(1, "Table"),
    CHAIR(2, "Chair"),
    LIGHT(3, "Light");
    int typeID;
    String typeName;
    ProductType(int typeID, String typeName){
        this.typeID=typeID;
    }

    public int getTypeID() {
        return typeID;
    }

    public String getTypeName() {
        return typeName;
    }
}
