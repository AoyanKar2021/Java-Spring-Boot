package com.springboot.test.Services;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider
        implements AuthenticationProvider {

    private JpaUserDetailsService jpaUserDetailsService;
    private PasswordEncoder passwordEncoder;

    public CustomAuthenticationProvider(JpaUserDetailsService jpaUserDetailsService, PasswordEncoder passwordEncoder) {
        this.jpaUserDetailsService = jpaUserDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String name=authentication.getName();
//        Getting Pass from front site
        String pass=String.valueOf(authentication.getCredentials());
//        Getting User Object using userdetails
        UserDetails s=jpaUserDetailsService.loadUserByUsername(name);
        if(s!=null)
        {
//            If pass massing return fully authenticated
           if(passwordEncoder.matches(pass,s.getPassword()))
           {
//          pass authentication interface implementation class token
               UsernamePasswordAuthenticationToken fullyauthenticated= new  UsernamePasswordAuthenticationToken(name,pass,s.getAuthorities());
               return fullyauthenticated;
           }
        }
        throw new BadCredentialsException("Error");
    }

    @Override
    public boolean supports(Class<?> autype) {
        return UsernamePasswordAuthenticationToken.class.equals(autype);
    }
}
