package com.comein.model;

import lombok.Data;

@Data
public class UpdateUserInfoCase {

    private int id;
    private int userId;
    private String userName;
    private int sex;
    private int age;
    private int permission;
    private int isDelete;
    private String expected;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
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

    public String getExpected() {
        return expected;
    }
}
