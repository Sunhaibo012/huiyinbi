package com.nenu.huiyinbi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @auther hiber
 * @create 2020/7/21
 */
@Data
@AllArgsConstructor
@ToString
public class DiscussPost {
    private int id;
    private int userId; //外键
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
