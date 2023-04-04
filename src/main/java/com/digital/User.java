package com.digital;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private String name;

    private int age;



    public void sayHi() {
        System.out.println("Hello from " + getName());
    }

    public void login (String username, String password) {
        System.out.println("login");
    }
}