package com.djb.study.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {
    /**
     * 默认跳转模板引擎页面
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 使用后台动态数据
     * @param model
     * @return
     */
    @RequestMapping("/variable")
    public String variable(Model model){
        model.addAttribute("name","Temdy");
        model.addAttribute("title","Thymeleaf");
        return "variable";
    }

    /**
     * if-else条件分支使用
     * @param model
     * @return
     */
    @RequestMapping("/if-else")
    public String ifelse(Model model){
        model.addAttribute("name","Temdy");
        model.addAttribute("sex",0);
        return "if-else";
    }

    /**
     * if-else条件分支使用
     * @param model
     * @return
     */
    @RequestMapping("/each")
    public String each(Model model){
        List<Map<String,Object>> persons = new ArrayList<>();
        Map<String,Object> person1 = new HashMap<>();
        person1.put("name","Temdy");
        person1.put("sex",0);
        persons.add(person1);
        Map<String,Object> person2 = new HashMap<>();
        person2.put("name","Lily");
        person2.put("sex",1);
        persons.add(person2);
        model.addAttribute("persons",persons);
        return "each";
    }

    /**
     * Thymeleaf模板引入
     * @param model
     * @return
     */
    @RequestMapping("/template")
    public String template(Model model){
        return "template";
    }
}
