package com.madhawa.fullstack.service;

import com.madhawa.fullstack.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
