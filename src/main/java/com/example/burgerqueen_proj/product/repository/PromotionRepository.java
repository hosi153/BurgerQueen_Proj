package com.example.burgerqueen_proj.product.repository;

import com.example.burgerqueen_proj.product.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
