package com.gintire.springboottest.junit5;

import com.gintire.springboottest.application.UserService;
import com.gintire.springboottest.domain.Gender;
import com.gintire.springboottest.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    User[] users = new User[5];

    @BeforeEach
    void 초기화() {
        users[0] = new User("james", 32, Gender.MALE);
        users[1] = new User("paul", 49, Gender.INTERSEX);
        users[2] = new User("ariana", 22, Gender.FEMALE);
        users[3] = new User("dave", 54, Gender.MALE);
        users[4] = new User("luka", 23, Gender.MALE);
    }

    @Test
    void 모든유저테스트() {
        assertArrayEquals(users, userService.getAllUsers());
    }
}
