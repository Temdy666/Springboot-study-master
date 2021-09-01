package com.djb.study.mybatisplus.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 人类表(person)实体类
 *
 * @author temdy
 * @since 2021-09-01 22:27:36
 * @description 
 */
@Data
@TableName("person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 编号，自动增长
     */
    @TableId(type = IdType.AUTO)
	private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 性别 0-男 1-女
     */
    private Integer sex;
    /**
     * 是否删除 0-未删除 1-已删除
     */
    private Integer isDeleted;

}