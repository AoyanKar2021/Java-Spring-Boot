package com.springboot.test.securityConfig;

//import com.springboot.test.beanConfig.BeansConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Configuration
//@EnableWebSecurity
//public class CustomSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication().withUser("aoyan").password("antu").roles("USER");
//    }
//    @Bean
//    public PasswordEncoder getpasswordEncoder()
//    {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}

//    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//       UserDetails user=User.withUsername("aoyan")
//                            .password("antu")
//                            .roles("user")
//                            .build();
//
//
//    return new InMemoryUserDetailsManager(user);
//    }

//   ================== Custom Login Page adding code in Spring Security ==================
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                    .loginPage("/login")
//
//                    .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//   ==================End Custom Login Page adding code in Spring Security End==================


