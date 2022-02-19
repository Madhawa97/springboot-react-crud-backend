package com.madhawa.fullstack.service;

import com.madhawa.fullstack.model.User;
import com.madhawa.fullstack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;  // insert repository to our service class

    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }
}
