package com.fastcampus.springpractice.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@ComponentScan("com.fastcampus.springpractice") // springpractice 이하의 모든 스프링 빈들을 스캔하겠다!
@Configuration
public class Config {

}
