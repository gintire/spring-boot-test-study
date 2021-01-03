package com.gintire.springboottest.junit5;

import com.gintire.springboottest.application.UserService;
import com.gintire.springboottest.domain.Gender;
import com.gintire.springboottest.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    public List<User> users = new ArrayList<>();

    @BeforeEach
    void 초기화() {
        users.add(new User(0, "james", 32, Gender.MALE));
        users.add(new User(1, "paul", 49, Gender.INTERSEX));
        users.add(new User(2, "ariana", 22, Gender.FEMALE));
        users.add(new User(3, "dave", 54, Gender.MALE));
        users.add(new User(4, "luka", 23, Gender.MALE));
    }

    @Test
    void 모든유저테스트() {
        assertEquals(users, userService.getAllUsers());
    }
    @Test
    void 유저검색테스트() {
        assertEquals(userService.getUser("james"), new User(0, "james", 32, Gender.MALE));
    }
}
