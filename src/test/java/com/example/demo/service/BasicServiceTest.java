package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicServiceTest {

    @Test
    void testLengthString() {
        BasicService sut = new BasicService();
        int actual = sut.provideService("mamma");
        System.out.println(actual);
        Assertions.assertEquals(5, actual);
    }
}