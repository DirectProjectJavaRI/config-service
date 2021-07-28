package org.nhindirect.config.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@ComponentScan({"org.nhindirect.config"})
@SpringBootApplication()
@EnableR2dbcRepositories("org.nhindirect.config.repository")
@EnableScheduling
public class ConfigServiceApplication
{	
    public static void main(String[] args) 
    {
    	final SpringApplication app =  new SpringApplication(ConfigServiceApplication.class);
    	app.setWebApplicationType(WebApplicationType.REACTIVE);
    	app.run(args);
    }  

}
