package com.comein.model;

import lombok.Data;

@Data
public class AddUserCase {
    private String userName;
    private String password;
    private int sex;
    private int age;
    private int permission;
    private int isDelete;
    private String expected;

    public String getExpected() {
        return expected;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getPermission() {
        return permission;
    }

    public int getIsDelete() {
        return isDelete;
    }
}
