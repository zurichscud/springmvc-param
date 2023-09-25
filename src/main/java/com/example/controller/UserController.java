package com.example.controller;

import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zurichscud
 * @Date: 2023/9/25 19:54
 * @Description: TODO
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("查询"+id);
        return "success";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("删除"+id);
        return "success";
    }
    @PostMapping
    public String save(User user){
        System.out.println("保存"+user);
        return "success";
    }
    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("修改"+user);
        return "success";
    }
}
