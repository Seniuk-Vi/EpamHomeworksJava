package com.epam.spring.homework2.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2.beans")
@PropertySource("application.properties")
@Import(OtherConfig.class)
public class BeanConfig {
}
