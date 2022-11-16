/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niiit.jdp.product;

public class Product {
    private int productId;
    private String name;
    private String productStatus;
    private String ProductReview;

    public Product() {
    }

    public Product(int productId, String name, String productStatus, String productReview) {
        this.productId = productId;
        this.name = name;
        this.productStatus = productStatus;
        ProductReview = productReview;
    }
}
