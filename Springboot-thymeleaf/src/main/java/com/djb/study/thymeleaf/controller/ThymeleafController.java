package com.djb.study.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
