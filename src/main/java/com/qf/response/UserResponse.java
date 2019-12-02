package com.qf.response;

import com.qf.domain.User;
import lombok.Data;

import java.util.List;

/**
 * Created by 长风 on 2019/11/27.
 */
@Data
public class UserResponse {
    private List<User> list;
    private Integer page;
    private Long total;
}
