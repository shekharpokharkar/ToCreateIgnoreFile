package com.SeleniumExpress.Configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityAppConfig {
	
	@Bean
	public PasswordEncoder password()
	{
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	public InMemoryUserDetailsManager userdetailsmanager()
	{
		SimpleGrantedAuthority role1=new SimpleGrantedAuthority("admin");
		SimpleGrantedAuthority role2=new SimpleGrantedAuthority("User");
		
		ArrayList<GrantedAuthority>authorities=new ArrayList<GrantedAuthority>();
		authorities.add(role2);
		authorities.add(role1);
		
		UserDetails shekhar=new User("shekhar","shekhar",authorities);
		
		
		
		InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager();
		inMemoryUserDetailsManager.createUser(shekhar);
		return inMemoryUserDetailsManager;
		
	}
}
