package com.mia.gov.az.tagim.service;

import com.google.gson.Gson;
import com.mia.gov.az.tagim.entity.User;
import com.mia.gov.az.tagim.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user==null){
            throw new UsernameNotFoundException("User : " + username + "not found!");
        }
        System.out.println(new Gson().toJson(user));

        return user;
    }
}
