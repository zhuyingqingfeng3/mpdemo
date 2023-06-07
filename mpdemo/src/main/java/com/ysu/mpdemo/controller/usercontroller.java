package com.ysu.mpdemo.controller;

import com.ysu.mpdemo.entity.user;
import com.ysu.mpdemo.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercontroller {
    @Autowired
    private usermapper uu;
    @RequestMapping("/user")
    public List query(){
        List<user> list=uu.find();
        System.out.println(list);
        return list;
    }
}
