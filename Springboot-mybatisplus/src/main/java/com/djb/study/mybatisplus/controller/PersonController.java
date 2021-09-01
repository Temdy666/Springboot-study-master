package com.djb.study.mybatisplus.controller;

import com.djb.study.mybatisplus.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 人类表服务控制器
 *
 * @author temdy
 * @since 2021-09-01 22:27:36
 * @description 
 */
@Slf4j
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("persons",personService.selectAll());
        return "index";
    }

}