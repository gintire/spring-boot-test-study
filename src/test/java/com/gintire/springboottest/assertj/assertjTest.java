package com.gintire.springboottest.assertj;

/**
 * Project: spring-boot-test
 * Package: com.gintire.springboottest.assertj
 * <p>
 * User: jin36
 * Date: 2021-01-10
 * Time: 오후 9:31
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class assertjTest {
    @Test
    public void test() {
        assertThat("Hello, world! Nice to meet you.") // 주어진 "Hello, world! Nice to meet you."라는 문자열은
                .isNotEmpty() // 비어있지 않고
                .contains("Nice") // "Nice"를 포함하고
                .contains("world") // "world"도 포함하고
                .doesNotContain("ZZZ") // "ZZZ"는 포함하지 않으며
                .startsWith("Hell") // "Hell"로 시작하고
                .endsWith("u.") // "u."로 끝나며
                .isEqualTo("Hello, world! Nice to meet you."); // "Hello, world! Nice to meet you."과 일치합니다.
    }
}
