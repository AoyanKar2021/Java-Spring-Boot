package com.springboot.test.securityConfig;

import com.springboot.test.Services.CustomAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class ProjectConfig extends WebSecurityConfigurerAdapter {
    private CustomAuthenticationProvider customAuthenticationProvider;
    protected ProjectConfig() {
        super();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
//        Passing Authentication Provider to Authentication ManagerBuilder/Manager
        auth.authenticationProvider(customAuthenticationProvider);
    }
}
