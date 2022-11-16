package com.niit.jdp;

import com.niit.jdp.config.ProductConfig;
import com.niit.jdp.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        /* Creating a new instance of the `AnnotationConfigApplicationContext` class and passing the `ProductConfig` class
         as a parameter.*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);

        // Calling the `product1` bean from the `ProductConfig` class.
        Product product1 = context.getBean("product1", Product.class);
        System.out.println("Product_1 = " + product1);

        // Calling the `product2` bean from the `ProductConfig` class.
        Product product2 = context.getBean("product2", Product.class);
        System.out.println("Product_2 = " + product2);

        // Calling the `product3` bean from the `ProductConfig` class.
        Product product3 = context.getBean("product3", Product.class);
        System.out.println("Product_3 = " + product3);


    }
}
