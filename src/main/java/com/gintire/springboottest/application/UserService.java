package com.gintire.springboottest.application;

import com.gintire.springboottest.domain.User;
import com.gintire.springboottest.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getUsers();
    }

    public User getUser(String name) {
        return userRepository.getUser(name);
    }
}
