/*
package com.sparta.myselectshop.util;

import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.entity.User;
import com.sparta.myselectshop.entity.UserRoleEnum;
import com.sparta.myselectshop.naver.dto.ItemDto;
import com.sparta.myselectshop.naver.service.NaverApiService;
import com.sparta.myselectshop.repository.ProductRepository;
import com.sparta.myselectshop.repository.UserRepository;
import com.sparta.myselectshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.sparta.myselectshop.service.ProductService.MIN_MY_PRICE;

@Component
public class TestDataRunner implements ApplicationRunner {

    @Autowired
    UserService userService;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    NaverApiService naverApiService;

    @Override
    public void run(ApplicationArguments args) {
        // 테스트 User 생성
        User testUser = new User("Seowoo", passwordEncoder.encode("1234"), "seowoo@email.com", UserRoleEnum.USER);
        testUser = userRepository.save(testUser);

        // 테스트 User 의 관심 상품 등록
        // 검색어 당 관심 상품 10개 등록
        createTestData(testUser, "나이키");
        createTestData(testUser, "아디다스");
        createTestData(testUser, "안경");
        createTestData(testUser, "키보드");
        createTestData(testUser, "천혜향");
        createTestData(testUser, "블루베리");
        createTestData(testUser, "백산수");
        createTestData(testUser, "참치 통조림");
        createTestData(testUser, "고구마");
        createTestData(testUser, "감자");
        createTestData(testUser, "커피");
    }

    private void createTestData(User user, String searchWord) {
        // 네이버 쇼핑 API 통해 상품 검색
        List<ItemDto> itemDtoList = naverApiService.searchItems(searchWord);

        List<Product> productList = new ArrayList<>();

        for (ItemDto itemDto : itemDtoList) {
            Product product = new Product();
            // 관심 상품 저장 사용자
            product.setUser(user);
            // 관심 상품 정보
            product.setTitle(itemDto.getTitle());
            product.setLink(itemDto.getLink());
            product.setImage(itemDto.getImage());
            product.setLprice(itemDto.getLprice());

            // 희망 최저가 랜덤값 생성
            // 최저 (100원) ~ 최대 (상품의 현재 최저가 + 10000원)
            int myPrice = getRandomNumber(MIN_MY_PRICE, itemDto.getLprice() + 10000);
            product.setMyPrice(myPrice);

            productList.add(product);
        }

        productRepository.saveAll(productList);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}*/
