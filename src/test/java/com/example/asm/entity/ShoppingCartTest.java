package com.example.asm.entity;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ShoppingCartTest {
    @Test
    public void demoBuilder(){
        CartItem item = new CartItem();
        item.setId(new CartItemId());
        item.setProductImage("");
        item.setUnitPrice(new BigDecimal(0));
        item.setQuantity(1);
        System.out.println(item.toString());
        CartItem item2 = CartItem.builder()
                .id(new CartItemId())
                .productImage("")
                .build();
        System.out.println(item2.toString());
    }
}