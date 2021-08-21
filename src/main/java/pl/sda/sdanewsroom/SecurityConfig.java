package pl.sda.sdanewsroom;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers(HttpMethod.POST, "/phonebook").authenticated()
            .anyRequest().permitAll()
            .and().formLogin().defaultSuccessUrl("/phonebook")
            .and().httpBasic()
            .and().logout()
            .and().headers().frameOptions().disable()
            .and().csrf().disable()
        ;
    }
}
