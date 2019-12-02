package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by 长风 on 2019/11/27.
 */
@SpringBootApplication
public class MySpringBootApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MySpringBootApplication.class);
    }
}
