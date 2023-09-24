package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 18:47
 * @Description: TODO
 */
@Configuration
@ComponentScan({"com.example.dao","com.example.service","com.example.pojo"})
public class SpringConfig {
}
