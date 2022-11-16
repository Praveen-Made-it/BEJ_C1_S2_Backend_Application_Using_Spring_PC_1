package com.niit.jdp;

import com.niit.jdp.config.ProductConfig;
import com.niit.jdp.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        //calling product1
        Product product1 = context.getBean("product1", Product.class);
        System.out.println("Product_1 = " + product1);
        //calling product2
        Product product2 = context.getBean("product2", Product.class);
        System.out.println("Product_2 = " + product2);
        //calling product3
        Product product3 = context.getBean("product3", Product.class);
        System.out.println("Product_3 = " + product3);


    }
}
