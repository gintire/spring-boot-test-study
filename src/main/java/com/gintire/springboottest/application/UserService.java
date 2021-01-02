package com.gintire.springboottest.application;

import com.gintire.springboottest.domain.Gender;
import com.gintire.springboottest.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User[] getAllUsers() {
        User[] users = new User[5];
        users[0] = new User("james", 32, Gender.MALE);
        users[1] = new User("paul", 49, Gender.INTERSEX);
        users[2] = new User("ariana", 22, Gender.FEMALE);
        users[3] = new User("dave", 54, Gender.MALE);
        users[4] = new User("luka", 23, Gender.MALE);
        return users;
    }
}
