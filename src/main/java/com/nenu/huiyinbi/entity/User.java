package com.nenu.huiyinbi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @auther hiber
 * @create 2020/7/19
 */
@AllArgsConstructor
@Data
@ToString
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;

    public User() {

    }
}
