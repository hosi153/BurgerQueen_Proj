package com.example.burgerqueen_proj.product.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor @Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PromotionInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long promotionId;


    @Enumerated(EnumType.STRING)
    @ColumnDefault("PromotionType.PROMOTION_EACH")
    private PromotionType promotionType;

    private String promotionName;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("DiscountType.DISCOUNT_AMOUNT")
    private DiscountType discountType;


    private int amount;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("PromotionStatus.PROMOTION_ING")
    private PromotionStatus promotionStatus;

    @Builder.Default
    @OneToMany(mappedBy = "promotion")
    private List<PromotionDetails> promotionDetails = new ArrayList<>();


    public enum PromotionType{
        PROMOTION_SET(1, "세트상인할품 "),// 세트 상품 할인
        PORMOTION_EVENT(2, "무료 증정"), //무료로 증정되는 사은품
        PROMOTION_EACH(3, "단품 할인"), //단품 할인
        PROMOTION_GRADE(4, "등급 할인"); //고객 등급별 할인
        
        private int promotionTypeNumber;
        private String promotionTypeName;

        PromotionType(int promotionTypeNumber, String promotionTypeName){
            this.promotionTypeNumber = promotionTypeNumber;
            this.promotionTypeName = promotionTypeName;
        }


    }

    public enum DiscountType{
        DISCOUNT_AMOUNT(1, "정액할인"), // 정액 할인
        DISCOUNT_RATE(2,"정률할인"); // 정률 할인

        private int discountTypeNumber;
        private String discountTypeName;
        DiscountType(int discountTypeNumber,String discountTypeName){
            this.discountTypeNumber = discountTypeNumber;
            this.discountTypeName = discountTypeName;
        }
    }



    public enum PromotionStatus{
        PROMOTION_ING(1,"진행중"), // 프로모션 진행중
        PROMOTION_STOP(2, "종료"); // 프로모션 종료

        private int statusNumber;
        private String statusName;

        PromotionStatus(int statusNumber, String statusName) {
            this.statusNumber = statusNumber;
            this.statusName = statusName;
        }
    }



}
