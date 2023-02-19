package com.fastcampus.springpractice.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.fastcampus.springpractice") // springpractice 이하의 모든 스프링 빈들을 스캔하겠다!
@Configuration
public class Config {

}
