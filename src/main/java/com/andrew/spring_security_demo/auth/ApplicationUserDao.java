package com.andrew.spring_security_demo.auth;

import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface ApplicationUserDao {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
