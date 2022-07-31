package com.example.asm.entity;

import com.example.asm.entity.enums.ProductStatus;
import org.junit.jupiter.api.Test;

class ProductTest {
    @Test
    public void checkProductStatus(){
        System.out.println(ProductStatus.of(-1));
    }
}