package com.iwill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@ComponentScan({"com.iwill", "com.unitils.boot.autoconfigure"})
@SpringBootApplication
public class DemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTestApplication.class, args);
    }
}
