package com.springboot.test.repository;

import com.springboot.test.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByUsername (String username);
    // @Query("SELECT u FROM user u WHERE u.email = :email")
   // public User getUserByUserEmail(@Param ("email") String email);
}