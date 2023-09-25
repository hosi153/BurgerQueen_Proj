package com.example.burgerqueen_proj.product.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long productId;

    private String productName;

    private int productPrice;

    private int productCount; //default 10개

    private String productImage;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus = ProductStatus.PRODUCT_ING;

    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    //ProductDetails;

    @OneToMany(mappedBy = "product")
    private List<PromotionDetails> promotionDetails = new ArrayList<>();


    private enum ProductStatus{
        PRODUCT_ING(1, "판매중");

        private int statusNumber;
        private String statusDescription;

        ProductStatus(int statusNumber, String statusDescription){
            this.statusNumber = statusNumber;
            this.statusDescription = statusDescription;
        }

    }



}
