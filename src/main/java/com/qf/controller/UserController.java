package com.qf.controller;

import com.qf.domain.User;
import com.qf.response.UserResponse;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 长风 on 2019/11/27.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll/{size}/{page}")
    public UserResponse findAll(@PathVariable("size") Integer size, @PathVariable("page") Integer page) {
        UserResponse all = userService.findAll(size, page);
        System.out.println("8001");
        return all;
    }

    @RequestMapping("/findOne")
    public User findOne(@RequestBody User user) {
        System.out.println(user.getUserid());
        Integer id = user.getUserid();
        return userService.findById(id);
    }

    @RequestMapping("/updateuser")
    public User updateuser(@RequestBody User user) {
        return userService.updateById(user);
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public String deleteById(@RequestBody User user) {
        return userService.deleteById(user);
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public User insertUser(@RequestBody User user) {
        user.setState(1);
        return userService.insertUser(user);
    }
}
