package com.example.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(chain = true)

public class User {
    private String name;
    private  String surname;
    private int age;
}
