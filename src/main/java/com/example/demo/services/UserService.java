package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository, UserDetailsServerImpl userDetailsServerImp) {
        this.userRepository = userRepository;
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }


    public User getUserById (long id){
        return userRepository.getReferenceById(id);
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

}