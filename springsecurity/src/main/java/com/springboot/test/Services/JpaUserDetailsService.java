package com.springboot.test.Services;

import com.springboot.test.models.User;
import com.springboot.test.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class JpaUserDetailsService implements UserDetailsService {

    private  UserRepository userRepository;

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     Optional<User> user=userRepository.findUserByUsername(username);
//     if(user.isPresent()==true)
//     {
//         return new UserDetailsImp(user.get().);
//     }

        User u=user.orElseThrow(()-> new UsernameNotFoundException("Error"));
        return new UserDetailsImp(u);
    }

}
