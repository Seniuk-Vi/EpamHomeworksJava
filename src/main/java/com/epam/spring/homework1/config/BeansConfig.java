package com.epam.spring.homework1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework1.beans")
@Import(OtherConfig.class)
public class BeansConfig {
}
