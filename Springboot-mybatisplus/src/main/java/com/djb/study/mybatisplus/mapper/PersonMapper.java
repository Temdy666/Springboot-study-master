package com.djb.study.mybatisplus.mapper;

import com.djb.study.mybatisplus.pojo.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 人类表(person)数据Mapper
 *
 * @author temdy
 * @since 2021-09-01 22:27:36
 * @description 
*/
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}
