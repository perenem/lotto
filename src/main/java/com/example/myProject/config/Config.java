package com.example.myProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config{
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder(); //비밀번호를 암호화
    }

    @Bean //클래스 인스턴스
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((request) -> request
                        .requestMatchers("/css/**" , "/js/**" , "/img/**").permitAll() //** 모든것
                        .requestMatchers("/user/login" , "/user/userSignUp" , "/registrationSuccess").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .anyRequest().authenticated()) // 위에 폴더 외의 다른 폴더들은 인증받아야함 (anyRequest.authenticated)
                        .requestMatchers("/**").permitAll())

                .formLogin((form)->form
                        .loginPage("/user/login")
                        .loginProcessingUrl("/login")
                        .defaultSuccessUrl("/user" , true)) //로그인 성공하며 나오는 url
                .logout(out->out
                        .logoutSuccessUrl("/")
                        .logoutUrl("/logout"))

                .csrf(csrf -> csrf.disable());
        return http.build();
    }
}


