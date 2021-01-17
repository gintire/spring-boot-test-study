package com.gintire.springboottest.mockito;

import com.gintire.springboottest.application.UserService;
import com.gintire.springboottest.domain.Gender;
import com.gintire.springboottest.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Project: spring-boot-test
 * Package: com.gintire.springboottest.mockito
 * <p>
 * User: jin36
 * Date: 2021-01-17
 * Time: 오후 2:17
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    UserService userService = mock(UserService.class);
    List mockedList = mock(List.class);
    @BeforeEach
    public void 초기화 () {
        // stubbing
        when(userService.getUser("james")).thenReturn(new User(1, "James", 19, Gender.INTERSEX));
    }
    @Test
    public void 전체_유저_확인() {
        // mock


        // mock 사용하기
        userService.getAllUsers();
        mockedList.add("one");
        mockedList.clear();

        // verification
        verify(mockedList).add("one");
        verify(mockedList).clear();

        verify(userService).getAllUsers();
    }

    @Test
    public void stubbing을이용한_유저_테스트() {
        System.out.println(userService.getUser("james"));
        verify(userService).getUser("james");
        Assertions.assertThat(new User(1, "James", 19, Gender.INTERSEX)).isEqualTo(userService.getUser("james"));
    }
}
