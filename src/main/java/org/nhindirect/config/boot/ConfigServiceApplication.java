package org.nhindirect.config.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = { "org.nhindirect.config.springconfig", "org.nhindirect.config.boot", 
		"org.nhindirect.config.store", "org.nhindirect.config.resources"})
@SpringBootApplication
@Configuration
@EnableEurekaClient
public class ConfigServiceApplication
{	
    public static void main(String[] args) 
    {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }  

}
