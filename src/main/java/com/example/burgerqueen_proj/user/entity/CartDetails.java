package com.example.burgerqueen_proj.user.entity;


import com.example.burgerqueen_proj.product.entity.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CartDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartDetailsId;

    @OneToOne(mappedBy = "cart", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Cart cart;
    @OneToMany(mappedBy = "cart", cascade = CascadeType.PERSIST)
    private List<Product> products = new ArrayList<>();
    private Integer count;




}
