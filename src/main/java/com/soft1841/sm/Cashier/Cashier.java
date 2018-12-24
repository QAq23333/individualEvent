package com.soft1841.sm.entity;

public class Cashier {
    private Integer id;
    private String workNumber;
    private String password;
    private String name;
    private String avatar;

    public Cashier(Integer id, String workNumber, String password, String name, String avatar) {
        this.id = id;
        this.workNumber = workNumber;
        this.password = password;
        this.name = name;
        this.avatar = avatar;
    }

    public Cashier(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "com.soft1841.sm.Cashier{" +
                "id=" + id +
                ", workNumber='" + workNumber + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
