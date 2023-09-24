package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 18:21
 * @Description: TODO
 */
@Configuration
@ComponentScan("com.example")
@EnableWebMvc
public class WebConfig {
}
