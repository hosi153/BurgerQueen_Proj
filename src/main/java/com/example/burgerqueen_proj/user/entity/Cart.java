package com.example.burgerqueen_proj.user.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private Integer totalCount;

    private Integer totalDiscountPrice;

    private Integer totalPrice;

    private Date CreateAt;
    private Date modifiedAt;
}
