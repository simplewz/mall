package org.simple.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.ware.entity.WmsWareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:27:09
 */
public interface WmsWareOrderTaskDetailService extends IService<WmsWareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

