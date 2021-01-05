# spring-boot-test-study
---

### 목표

* spring-boot-starter-test 에 대해서 연구한다.
* Junit5 사용법에 대해 학습한다.
* assertj 사용법에 대해 학습한다.
* mockito 사용법에 대해서 학습한다.


---
### Junit5 사용법에 대해 연구
> https://blog.jetbrains.com/idea/2020/09/writing-tests-with-junit-5/?gclid=Cj0KCQiAlsv_BRDtARIsAHMGVSbbwpryCT-CKVlc9EEh3MezPAV3S29yG_hWD6UvTPgy1r-MxGT9GkwaAkAWEALw_wcB

#### 연구 내용
* 기본적인 사용법
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

*** JUni5의 어노테이션
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
