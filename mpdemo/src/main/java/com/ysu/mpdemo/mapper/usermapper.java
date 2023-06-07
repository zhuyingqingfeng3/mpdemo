package com.ysu.mpdemo.mapper;

import com.ysu.mpdemo.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface usermapper {
    @Select("select * from user")
    public List<user> find();

}
