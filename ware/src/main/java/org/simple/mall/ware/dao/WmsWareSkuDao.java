package org.simple.mall.ware.dao;

import org.simple.mall.ware.entity.WmsWareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:27:09
 */
@Mapper
public interface WmsWareSkuDao extends BaseMapper<WmsWareSkuEntity> {
	
}
