package com.example.burgerqueen_proj.product.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor @Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long productId;

    private String productName;

    private int productPrice;

    @ColumnDefault("10")
    private int productCount; //default 10개

    private String productImage;

    @Transient
    private int discountPrice = setDiscountPrice();

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus = ProductStatus.PRODUCT_STOP;

    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;


    @OneToMany(mappedBy = "product")
    private List<PromotionDetails> promotionDetails = new ArrayList<>();

    //ProductDetails;
    private int setDiscountPrice(){
        //상품에 연동된 promotiondetails 중, 단품할인+판매중인 데이터가 있는 경우 discoutprice 업데이트
        return 1;
    }


    public enum ProductStatus{
        PRODUCT_ING(1, "판매중"),
        PRODUCT_STOP(2, "판매 중지"),
        PRDOUCT_EMPTY(3, "재고 없음");

        private int statusNumber;
        private String statusDescription;

        ProductStatus(int statusNumber, String statusDescription){
            this.statusNumber = statusNumber;
            this.statusDescription = statusDescription;
        }

    }



}
