package com.example.controller;

import com.example.pojo.User;
import com.example.pojo.User2;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: zurichscud
 * @Date: 2023/9/25 10:45
 * @Description: TODO
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @ResponseBody
    @RequestMapping("/demo1")
    public String demo1(String name){
        System.out.println(name);
        return "name="+name;
    }
    @ResponseBody
    @RequestMapping("/demo0")
    public String demo0(@RequestParam("username") String name){
        System.out.println(name);
        return "name="+name;
    }
    @ResponseBody
    @RequestMapping("/demo2")
    public String demo2(Integer age,String name){
        System.out.println(name+age);
        return "name,age="+name+age;
    }
    @ResponseBody
    @RequestMapping("/demo3")
    public String demo3(User user){
        System.out.println(user);
        return user.toString();
    }
    @ResponseBody
    @RequestMapping("/demo4")
    public String demo4(String[] names){
        System.out.println(Arrays.toString(names));
        return Arrays.toString(names);
    }
    @ResponseBody
    @RequestMapping("/demo5")
    public String demo5(@RequestParam ArrayList<String> names){
        System.out.println(names);
        return names.toString();
    }
    @ResponseBody
    @RequestMapping("/demo6")
    public String demo6(User2 user){
        System.out.println(user);
        return user.toString();
    }
    @ResponseBody
    @RequestMapping("/demo7")
    public String demo7(@RequestBody List<User> user){
        System.out.println(user);
        return "OK";
    }
    @ResponseBody
    @RequestMapping("/demo8")
    public String demo8(@DateTimeFormat(pattern = "yyyy年MM月dd日HH:mm:ss") Date date){
        System.out.println(date);
        return date.toString();
    }


}
