package org.simple.mall.order.dao;

import org.simple.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:23:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
