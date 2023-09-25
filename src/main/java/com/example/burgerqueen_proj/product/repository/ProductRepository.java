package com.example.burgerqueen_proj.product.repository;

import com.example.burgerqueen_proj.product.entity.Category;
import com.example.burgerqueen_proj.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory(Category category);
    List<Product> findAllByCategoryAndProductStatus(Category category, Product.ProductStatus productStatus);
//    Optional<Product> findByStatusByOrderByCategoryDesc(String status);

}
