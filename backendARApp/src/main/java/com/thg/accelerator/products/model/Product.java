package com.thg.accelerator.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;
    private String product_name;
    private String product_desc;
    private int product_type_id;

    public void buildProduct(String product_name, String product_desc, ProductType productType) {
        this.product_name = product_name;
        this.product_desc = product_desc;
        this.product_type_id = productType.getTypeID();
    }

    public Product() {

    }

    public long getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public int getProduct_type_id() {
        return product_type_id;
    }
}
