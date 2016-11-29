package com.acessibilidade;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acessibilidade.Usuario;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
		
		http
            .authorizeRequests()
                .antMatchers("/admin", "/addInfo", "/listaInfos").authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        
        String sql = "SELECT * FROM usuarios";

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);


        for (Map row : rows) {
            
            auth
                .inMemoryAuthentication()
                .withUser((String)row.get("nome")).password((String)row.get("senha")).roles("USER");

        }

       
    }
}