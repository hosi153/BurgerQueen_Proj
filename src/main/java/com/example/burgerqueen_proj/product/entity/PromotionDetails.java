package com.example.burgerqueen_proj.product.entity;


import com.example.burgerqueen_proj.user.entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class PromotionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long promotionDetailsId;

    @ManyToOne
    @JoinColumn(name = "PROMOTION_ID")
    private PromotionInfo promotion;

    @ManyToOne
    @JoinColumn(name = "PROMOTION_TYPE")
    private PromotionInfo promotionType;

    @Transient
    @ManyToOne
    @JoinColumn(name = "PROMOTION_STATUS")
    private PromotionInfo promotionStatus;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;







}
