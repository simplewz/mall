package org.simple.mall.product.dao;

import org.simple.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-29 23:54:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
