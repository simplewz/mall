package org.simple.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-29 23:16:47
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

