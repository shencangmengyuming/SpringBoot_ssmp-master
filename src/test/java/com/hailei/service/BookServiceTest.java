package com.hailei.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService IbookService;

    @Test
    void testGetById(){
        System.out.println(IbookService.getById(4));
    }
}
