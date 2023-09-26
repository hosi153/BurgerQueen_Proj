package com.example.burgerqueen_proj.product.service;

import com.example.burgerqueen_proj.exception.BusinessLogicException;
import com.example.burgerqueen_proj.product.entity.PromotionInfo;
import com.example.burgerqueen_proj.product.repository.PromotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PromotionService {
    private final PromotionRepository promotionRepository;
    private final PromotionDetailsRepository promotionDetailsRepository;

    public int getPromotionPrice(int price, PromotionInfo promotion){
        switch (promotion.getPromotionType()){
            case PROMOTION_EACH : // 프로모션 타입이 단품일 경우
                if(promotion.getDiscountType().equals(PromotionInfo.DiscountType.DISCOUNT_AMOUNT))
                    return price-promotion.getAmount();
                else return price-(price*promotion.getAmount());
            default:
                return price;
        }

    }

   // public List<PromotionInfo> getPromotionsByProductId(Long productId){
   //     Optional<PromotionInfo> allPromotions =  promotionDetailsRepository.findAllByProductId(productId);
 //   }
}
