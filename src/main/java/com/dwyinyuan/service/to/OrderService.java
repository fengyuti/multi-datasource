package com.dwyinyuan.service.to;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dwyinyuan.model.pojo.Order;

import java.util.List;


public interface OrderService extends IService<Order> {

    /**
     * 查询订单列表
     *
     * @return
     */
    List<Order> getOrderList();
}
