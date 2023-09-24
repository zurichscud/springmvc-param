package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 15:43
 * @Description: TODO
 */
@Controller
public class MainController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "第一个SpringMVC项目";
    }
}
