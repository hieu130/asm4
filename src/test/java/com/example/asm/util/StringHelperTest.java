package com.example.asm.util;

import org.junit.jupiter.api.Test;

class StringHelperTest {
    @Test
    public void testSlug(){
        System.out.println(StringHelper.toSlug("Welcome to Vietnam"));
    }
}