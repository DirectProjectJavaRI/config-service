package org.nhindirect.config.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication()
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
