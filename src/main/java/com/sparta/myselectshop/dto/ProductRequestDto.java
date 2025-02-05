package com.sparta.myselectshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {

    // 관심 상품명
    private String title;
    // 관심 상품 썸네일 image URL
    private String image;
    // 관심 상품 구매 링크 URL
    private String link;
    // 관심 상품의 최저가
    private int lprice;
}