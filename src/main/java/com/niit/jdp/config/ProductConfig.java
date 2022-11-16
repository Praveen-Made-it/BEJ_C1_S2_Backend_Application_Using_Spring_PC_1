/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.config;

import com.niit.jdp.domain.Product;
import org.springframework.context.annotation.Bean;

public class ProductConfig {
    @Bean("product1")
    public Product getProduct1() {
        return new Product(1, "Mi Tv", "Delivered", "Good");
    }

}
