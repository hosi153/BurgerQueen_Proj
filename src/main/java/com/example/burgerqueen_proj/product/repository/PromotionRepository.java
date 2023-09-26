package com.example.burgerqueen_proj.product.repository;

import com.example.burgerqueen_proj.product.entity.PromotionDetails;
import com.example.burgerqueen_proj.product.entity.PromotionInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<PromotionInfo, Long> {
}
