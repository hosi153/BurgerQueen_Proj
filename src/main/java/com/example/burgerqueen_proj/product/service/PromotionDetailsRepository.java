package com.example.burgerqueen_proj.product.service;

import com.example.burgerqueen_proj.product.entity.PromotionDetails;
import com.example.burgerqueen_proj.product.entity.PromotionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PromotionDetailsRepository extends JpaRepository<PromotionDetails, Long> {
    //Optional<PromotionInfo> findAllByProductId(Long productId);
    //Optional<PromotionInfo> findAllByProductIdAndPromotionStatus(Long productId, PromotionInfo.PromotionStatus productStatus);

}
