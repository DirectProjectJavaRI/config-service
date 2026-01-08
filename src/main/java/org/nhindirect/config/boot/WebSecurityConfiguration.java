package org.nhindirect.config.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class WebSecurityConfiguration 
{
	@Bean
	SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http)
	{

		http.csrf(ServerHttpSecurity.CsrfSpec::disable);
		http.formLogin(ServerHttpSecurity.FormLoginSpec::disable);
		
		
       http.authorizeExchange(exchanges -> exchanges
	        .pathMatchers(
	            "/domains/**",
	            "/address/**",
	            "/anchor/**",
	            "/certificate/**",
	            "/certpolicy/**",
	            "/trustbundle/**",
	            "/dns/**"
	        ).authenticated()
	        .anyExchange().permitAll());

       http.httpBasic(Customizer.withDefaults());
		
	    return http.build();
	}

		      
}
