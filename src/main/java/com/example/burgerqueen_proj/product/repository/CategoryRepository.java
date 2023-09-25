package com.example.burgerqueen_proj.product.repository;

import com.example.burgerqueen_proj.product.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
