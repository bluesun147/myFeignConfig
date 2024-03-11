package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @AutoConfiguration // 자동구성 설정 어노테이션
@Configuration
@ComponentScan("com.example.demo")
public class AutoConfig {
}