package org.simple.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.simple.common.utils.PageUtils;
import org.simple.common.utils.Query;

import org.simple.mall.ware.dao.WmsPurchaseDetailDao;
import org.simple.mall.ware.entity.WmsPurchaseDetailEntity;
import org.simple.mall.ware.service.WmsPurchaseDetailService;


@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl extends ServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetailEntity> implements WmsPurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsPurchaseDetailEntity> page = this.page(
                new Query<WmsPurchaseDetailEntity>().getPage(params),
                new QueryWrapper<WmsPurchaseDetailEntity>()
        );

        return new PageUtils(page);
    }

}