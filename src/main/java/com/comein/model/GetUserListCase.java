package com.comein.model;

import lombok.Data;

@Data
public class GetUserListCase {
    private String userName;
    private int age;
    private int sex;
    private String expected;

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public String getExpected() {
        return expected;
    }
}
