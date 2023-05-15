package com.example.module4intentex2java_new.modul;

import java.io.Serializable;

public class User implements Serializable {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
