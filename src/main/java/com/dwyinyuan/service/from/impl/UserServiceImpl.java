package com.dwyinyuan.service.from.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dwyinyuan.datasource.DBTypeEnum;
import com.dwyinyuan.datasource.DataSourceSwitch;
import com.dwyinyuan.mapper.UserMapper;
import com.dwyinyuan.model.pojo.User;
import com.dwyinyuan.service.from.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @DataSourceSwitch(DBTypeEnum.db2)
    public Integer create(User user) {
        return userMapper.insert(user);
    }
}
