package com.example.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests().antMatchers("/api/v1/*").permitAll();
        httpSecurity.authorizeHttpRequests().antMatchers("/api/v1/*").hasAnyAuthority("user");
        httpSecurity.authorizeHttpRequests().antMatchers("/api/v1/*").hasAnyAuthority("admin");

    }
}
