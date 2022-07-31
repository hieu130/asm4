package com.example.asm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
    protected void configure(HttpSecurity http) throws Exception{
    MyAuthenticationFilter authenticationFilter = new MyAuthenticationFilter(authenticationManagerBean());
    authenticationFilter.setFilterProcessesUrl("/api/v1/accounts/login");
      http.authorizeHttpRequests().antMatchers("/api/v1/hello", "/api/v1/account/*").permitAll();
      http.authorizeHttpRequests().antMatchers("/api/v1/user").hasAnyAuthority("USER", "ADMIN");
      http.authorizeHttpRequests().antMatchers("/api/v1/admin").hasAnyAuthority("ADMIN");
      http.addFilterBefore(new MyAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
  }
}
