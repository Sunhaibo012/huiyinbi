package com.nenu.huiyinbi.service;

import com.nenu.huiyinbi.dao.DiscussPostMapper;
import com.nenu.huiyinbi.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther hiber
 * @create 2020/7/22
 */
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit){
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }



    public int findDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostsRows(userId);
    }
}
