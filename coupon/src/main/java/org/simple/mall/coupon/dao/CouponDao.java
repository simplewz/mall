package org.simple.mall.coupon.dao;

import org.simple.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:00:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
