package com.nenu.huiyinbi.dao;

import com.nenu.huiyinbi.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther hiber
 * @create 2020/7/19
 */
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
