package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServerImpl implements UserDetailsService {
    private final UserRepository userRepository;


    public UserDetailsServerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Запрос на поиск пользователя с логином: " + username);
        User user = userRepository.findByUsername(username);
        System.out.println("Найден пользователь: " + user);
        return user;
    }

//    public String testFindUserByLogin() {
//        String loginToFind = "kek";
//        User foundUser = userRepository.findByUsername(loginToFind);
//        System.out.println("Найден пользователь: " + foundUser);
//        return loginToFind;
//    }

}

