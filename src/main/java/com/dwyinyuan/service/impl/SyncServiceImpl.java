package com.dwyinyuan.service.impl;

import com.dwyinyuan.model.pojo.Order;
import com.dwyinyuan.model.pojo.User;
import com.dwyinyuan.service.SyncService;
import com.dwyinyuan.service.from.UserService;
import com.dwyinyuan.service.to.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyncServiceImpl implements SyncService {

    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;

    @Override
    public void sync() {

        //查询数据源中的数据
        List<Order> orderList = orderService.getOrderList();

        for (Order order : orderList) {

            // 插入到需要同步的表中
            User user = User.builder()
                    .name(order.getUserId() + "")
                    .build();
            userService.create(user);
        }
    }
}
