package com.springboot.test.Services;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationProviderImp implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username=authentication.getName();
        String Pass=authentication.getCredentials().toString();
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
