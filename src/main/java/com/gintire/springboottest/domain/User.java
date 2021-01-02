package com.gintire.springboottest.domain;

import java.util.Date;
import java.util.Objects;

public class User {
    private String name;
    private Integer age;
    private Gender gender;

    public User(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
