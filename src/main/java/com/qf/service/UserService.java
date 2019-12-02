package com.qf.service;

import com.qf.domain.User;
import com.qf.response.UserResponse;

import java.util.List;

/**
 * Created by 长风 on 2019/11/27.
 */
public interface UserService {
    UserResponse findAll(Integer size, Integer page);

    User insertUser(User user);

    User findById(Integer id);

    User updateById(User user);

    String deleteById(User user);

}
