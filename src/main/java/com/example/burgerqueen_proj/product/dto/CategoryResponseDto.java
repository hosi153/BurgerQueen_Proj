package com.example.burgerqueen_proj.product.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CategoryResponseDto {
    private long categoryId;
    private String categoryName;

}
