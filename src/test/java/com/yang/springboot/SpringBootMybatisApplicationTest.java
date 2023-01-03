package com.yang.springboot;

import com.yang.dao.BookDao;
import com.yang.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootMybatisApplicationTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }
}
