package com.djb.study.mybatisplus.service;


import com.djb.study.mybatisplus.pojo.Person;

import java.util.List;

/**
 * 人类表服务接口
 *
 * @author temdy
 * @since 2021-09-01 22:27:36
 * @description 
 */
public interface PersonService {
    List<Person> selectAll();
}
