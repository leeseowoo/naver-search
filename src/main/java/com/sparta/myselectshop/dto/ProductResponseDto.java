package com.sparta.myselectshop.dto;

import com.sparta.myselectshop.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class ProductResponseDto {

    private Long id;
    private String title;
    private String link;
    private String image;
    private int lprice;
    private int myPrice;
    private List<FolderResponseDto> productFolderList = new ArrayList<>();

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.link = product.getLink();
        this.image = product.getImage();
        this.lprice = product.getLprice();
        this.myPrice = product.getMyPrice();
        product.getProductFolderList().forEach(productFolder -> {
            this.productFolderList.add(new FolderResponseDto(productFolder.getFolder()));
        });
    }
}