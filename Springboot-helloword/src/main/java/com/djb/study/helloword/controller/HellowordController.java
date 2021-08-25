/*
Copyright [2020] [http://www.djb-blog.com]
 */
package com.djb.study.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个Springboot程序HelloWord
 * @author Temdy
 * @date 2021-08-26
 */
@RestController
public class HellowordController {

    @RequestMapping("/")
    public String sayHello(){
        return "helloword";
    }
}
