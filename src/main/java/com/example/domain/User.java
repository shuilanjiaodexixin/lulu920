package com.example.domain;

/**
 * 用户实体类
 */
public class User {
    private int id;
    private String  USERNAME;
    private String  PASSWORD;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", USERNAME='" + USERNAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }
}
