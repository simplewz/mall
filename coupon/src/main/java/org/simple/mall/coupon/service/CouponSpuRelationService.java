package org.simple.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:00:50
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

