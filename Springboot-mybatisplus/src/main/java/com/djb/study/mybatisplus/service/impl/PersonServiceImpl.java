package com.djb.study.mybatisplus.service.impl;

import com.djb.study.mybatisplus.mapper.PersonMapper;
import com.djb.study.mybatisplus.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import com.djb.study.mybatisplus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 人类表服务接口实现
 *
 * @author temdy
 * @since 2021-09-01 22:27:36
 * @description 
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public List<Person> selectAll() {
        return personMapper.selectList(null);
    }
}