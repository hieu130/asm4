package com.example.asm.entity.dto;

import com.example.asm.entity.ShoppingCart;
import com.example.asm.entity.ShoppingCart;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingCartDTO {
    private String id;
    private String userId; // ai tạo
    private BigDecimal totalPrice;
    private String shipName;
    private String shipAddress;
    private String shipPhone;
    private String shipNote;
    private Set<com.example.asm.entity.dto.CartItemDTO> items;

    public ShoppingCart generateCart(){
        return new ShoppingCart();
    }
}
