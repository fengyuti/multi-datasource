package com.dwyinyuan.service.from;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dwyinyuan.model.pojo.User;


public interface UserService extends IService<User> {

    Integer create(User user);
}
