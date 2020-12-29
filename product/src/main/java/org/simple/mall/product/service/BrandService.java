package org.simple.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-29 23:16:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

