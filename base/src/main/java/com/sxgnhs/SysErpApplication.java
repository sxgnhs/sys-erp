package com.sxgnhs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan(basePackages = {"com.sxgnhs.user.mapper"})

public class SysErpApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SysErpApplication.class, args);

        System.out.println(run.getEnvironment());    }

}