package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void UserInfo() {
        User FirstUser = User.builder().name("Olha").age(18).job("boss").job("student").gender(Gender.FEMALE).build();
        assertEquals("User(name=Olha, age=18, gender=FEMALE, weight=0.0, height=0.0, occupations=[boss, student])",
                FirstUser.toString());
        User SecondUser = User.builder().name("Max").age(10).job("seller").weight(7.0).height(7.0).gender(Gender.MALE).build();
        assertEquals("User(name=Max, age=10, gender=MALE, weight=7.0, height=7.0, occupations=[seller])",
                SecondUser.toString());

    }

}