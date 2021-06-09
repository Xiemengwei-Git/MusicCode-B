package com.MusicCode.backEnd.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //链式编程
    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问，但是功能页只有对应有权限的人才能访问
        //请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll();
        //没有权限默认到登陆页面，需要开启登陆页面
            // /login
        http.formLogin().loginPage("/toLogin").loginProcessingUrl("/login");

        http.csrf().disable();//关闭csrf功能
        //注销
        http.logout().logoutSuccessUrl("/");
        //记住我功能
        http.rememberMe().rememberMeParameter("remember");
    }

    //认证
    //密码编码：PasswordEncoder
    //在spring security 5.0+ 新增了很多的加密方式
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    }
}
