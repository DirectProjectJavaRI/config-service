package org.nhindirect.config.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class WebSecurityConfiguration 
{
	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http)
	{

		http.csrf().disable()
        .authorizeExchange()
        .pathMatchers("/domains/**", "/address/**", "/anchor/**", 
        		"/certificate/**", "/certpolicy/**", "/dns/**", 
        		"/setting/**", "/trustbundle/**").permitAll()
        .anyExchange().authenticated()
        .and()
        .httpBasic()
        .and()
        .formLogin().disable();


		
	    return http.build();
	}

		      
}
