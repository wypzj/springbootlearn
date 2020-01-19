package com.beast.tamer.learn.course01.testannotation.controller;

import com.beast.tamer.learn.course01.testannotation.domain.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a small asshole
 * @version 1.0
 * @description controller
 * @date in 15:28 2020/1/19
 * @since 1.0
 */
@RestController
public class TestController {
    @GetMapping("/get")
    public User getUser(){
        User user = new User();
        user.setName("卫云鹏");
        return user;
    }
}
