package com.djb.study.mybatisplus;

import com.djb.study.mybatisplus.mapper.PersonMapper;
import com.djb.study.mybatisplus.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {
    @Autowired
    private PersonMapper personMapper;
    @Test
    void contextLoads() {
        List<Person> list = personMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
