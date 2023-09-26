package com.example.burgerqueen_proj;

import com.example.burgerqueen_proj.product.entity.PromotionInfo;
import com.example.burgerqueen_proj.product.repository.PromotionRepository;
import com.example.burgerqueen_proj.product.service.ProductService;
import com.example.burgerqueen_proj.product.service.PromotionDetailsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@DataJpaTest
public class PromotionRepositoryTest {
    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private PromotionDetailsRepository promotionDetailsRepository;

    //@Autowired
    //private ProductService productService;

    @Autowired
    private PromotionInfo promotionInfo;


    @Test
    public void makePromotion(){
        //given : 프로모션 데이터 생성
        PromotionInfo promotionInfo = PromotionInfo.builder().amount(1000).promotionName("테스트 프로모션").build();

        //when
        PromotionInfo savedPromotion = promotionRepository.save(promotionInfo);

        //then
        assertNotNull(savedPromotion);
        assertTrue(promotionInfo.getPromotionName().equals(savedPromotion.getPromotionName()));

    }

    @Test
    public void findPromotionByProduct(){
        //given : 테스트할 product 데이터 준비
       // productService.findProduct(1L);


        //when : 프로모션에 데이터 넣기
        //promotionRepository.save();

        //then



    }

}
