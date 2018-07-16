package com.iwill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.iwill")
@MapperScan("com.iwill.mapper")
@SpringBootApplication
public class DemoTestApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.default", "ut");
        SpringApplication.run(DemoTestApplication.class, args);
    }
}
