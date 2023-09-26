package com.example.burgerqueen_proj;

import com.example.burgerqueen_proj.product.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class PromotionServiceTest {

    @Autowired
    private PromotionRepository promotionRepository;




}


