package org.nhindirect.config.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"org.nhindirect.config"})
@SpringBootApplication
@EnableEurekaClient
public class ConfigServiceApplication
{	
    public static void main(String[] args) 
    {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }  

}
