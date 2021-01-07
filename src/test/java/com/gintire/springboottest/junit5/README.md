# Junit5

## 기본적인 사용법
```
@Test
void test() {
    Assertions.assertEquals(1,1);
}
```

* Disable 처리
```
@Test
@Disabled
```

* Display를 위한 test name 정해주기
```
@Test
@DisplayName("Blah Blah")
```

* Multiple Assertions
```
assertAll()
```
* Assumptions
```
Assumptions.assumeTrue(조건);
```
* Data Driven Test
```
@parameterizedTest
@ValueSource(ints = {3, 4, 5, 6})
void test(int expectedNumbers) {}
```
* check Exceptions
```
assertThrows(IllegalArgumentException.calss, () -> {});
```

* Grouping tests with @Nested
```
@Nested
```

### JUni5의 어노테이션
> @Test  
> @ParameterizedTest  
> @RepeatedTest  
> @TestFactory  
> @TestTemplate  
> @TestMethodOrder  
> @TestInstance  
> @DisplayName  
> @DisplayNameGeneration  
> @BeforeEach  
> @AfterEach  
> @BeforeAll  
> @AfterAll  
> @Nested  
> @Tag  
> @Disabled  
> @Timeout  
> @ExtendWith  
> @RegisterExtension  
> @TempDir


### Assertions
> https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions  

JUnit Jupiter comes with many of the assertion methods that JUnit 4 has and adds a few that lend themselves well to being used with Java 8 lambdas. All JUnit Jupiter assertions are static methods in the org.junit.jupiter.api.Assertions class.

Assertions의 JUnit4와의 가장 큰 차이점은 Java8의 람다를 사용할 수 있다라는 것입니다. 따라서 테스트 코드를 Functional 하게 작성할 수 있다라는 것이 가장 큰 차이점입니다.

### Assumptions
> https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions

JUnit Jupiter comes with a subset of the assumption methods that JUnit 4 provides and adds a few that lend themselves well to being used with Java 8 lambda expressions and method references. All JUnit Jupiter assumptions are static methods in the org.junit.jupiter.api.Assumptions class.  

Assumptions 구문은 테스트 메서드가 특정한 조건에 대해서 실행하고자 할 때 사용하는 구문이다.
