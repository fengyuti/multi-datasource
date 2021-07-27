package com.dwyinyuan.service.to.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dwyinyuan.datasource.DBTypeEnum;
import com.dwyinyuan.datasource.DataSourceSwitch;
import com.dwyinyuan.mapper.OrderMapper;
import com.dwyinyuan.model.pojo.Order;
import com.dwyinyuan.service.to.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @DataSourceSwitch(DBTypeEnum.db1)
    public List<Order> getOrderList() {
        return super.list();
    }
}
