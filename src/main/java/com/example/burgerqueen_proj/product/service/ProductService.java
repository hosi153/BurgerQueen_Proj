package com.example.burgerqueen_proj.product.service;

import com.example.burgerqueen_proj.exception.BusinessLogicException;
import com.example.burgerqueen_proj.exception.ExceptionCode;
import com.example.burgerqueen_proj.product.dto.ProductResponseDto;
import com.example.burgerqueen_proj.product.entity.Category;
import com.example.burgerqueen_proj.product.entity.Product;
import com.example.burgerqueen_proj.product.repository.CategoryRepository;
import com.example.burgerqueen_proj.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;

    public ProductService(ProductRepository productRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
//        productRepository.save(Product.builder().productName("새우").productPrice(1000).category(categoryService.findCategoryById(1L)).build());

    }
    public Product findProduct(long productId){
        return findVerifyProduct(productId);
    }


    public List<Product> findAllProductByCategory() {
        Category category = categoryService.findCategoryById(1L);
        List<Product> products = productRepository.findAllByCategory(category);
        return products;

    }


    public Product findVerifyProduct(long productId){
        Optional<Product> optionalProduct = productRepository.findById(productId);
        Product product = optionalProduct.orElseThrow(() ->
                new RuntimeException()
        );
        return product;
    }

}
