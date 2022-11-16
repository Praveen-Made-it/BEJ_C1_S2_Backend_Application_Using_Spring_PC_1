/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.domain;

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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductReview() {
        return ProductReview;
    }

    public void setProductReview(String productReview) {
        ProductReview = productReview;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", productStatus='" + productStatus + '\'' +
                ", ProductReview='" + ProductReview + '\'' +
                '}';
    }
}
