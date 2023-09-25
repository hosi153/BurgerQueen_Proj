package com.example.burgerqueen_proj.product.entity;

import javax.persistence.*;

@Entity
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long productId;

    private String productName;

    private int productPrice;

    private String productImage;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus = ProductStatus.PRODUCT_ING;
    CategoryId;
    //ProductDetails;




    private enum ProductStatus{
        PRODUCT_ING(1, "판매중")

        

    }



}
