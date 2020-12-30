package org.simple.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.ware.entity.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:27:09
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

