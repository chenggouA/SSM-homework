package com.chenggou.ssm.homework.entity;

import lombok.Data;

import java.security.Timestamp;

@Data // 用户实体类
public class Users {
    private int userID;
    private String userName;
    private String email;
    private String password;
    private UserType userType;
    private Timestamp registrationDate;
    // 枚举类型定义
    public enum UserType {
        Buyer, Seller
    }
}
