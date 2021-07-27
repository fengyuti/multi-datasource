package com.dwyinyuan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dwyinyuan.model.pojo.Order;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;


public interface OrderMapper extends BaseMapper<Order> {
    @Select("SELECT price from t_order where user_id =#{userId}")
    BigDecimal getPriceByUserId(Integer userId);
}
