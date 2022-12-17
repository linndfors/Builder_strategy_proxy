package org.example.task2;

import lombok.Getter;
import lombok.Setter;
import org.example.task2.Gender;

public class Client {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender sex;
    private static int count = 0;


    public Client(String name, Gender sex, int age) {
        id = ++count;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
