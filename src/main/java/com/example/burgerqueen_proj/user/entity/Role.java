package com.example.burgerqueen_proj.user.entity;

import com.example.burgerqueen_proj.product.entity.PromotionDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roleId;

    private String Name;

    @OneToMany(mappedBy = "role")
    private List<PromotionDetails> promotionDetails = new ArrayList<>();
}
