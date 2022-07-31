package com.example.asm.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Credential {
    private String accessToken;
    private String refreshToken;
    private long expiredAt;
    private String scope;
}
