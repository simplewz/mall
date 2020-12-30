package org.simple.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.ware.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:27:09
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

