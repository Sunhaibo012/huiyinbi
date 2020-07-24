package com.nenu.huiyinbi.dao;

import com.nenu.huiyinbi.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther hiber
 * @create 2020/7/21
 */
@Mapper
public interface DiscussPostMapper {
    /*
    * 动态sql
    * userId==0时擦查询所有
    * userId为其它值就查询对应用户的帖子
    *status的值（0，1，2）分别为（普通，精华，拉黑）
    * offset起始条目帖子，limit为查询数量
    * */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //如果只有一个参数，且再<if>里使用，则必须用别名.
    int selectDiscussPostsRows(@Param("userId") int userId);


}
