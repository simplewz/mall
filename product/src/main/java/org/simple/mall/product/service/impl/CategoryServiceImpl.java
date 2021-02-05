package org.simple.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.simple.common.utils.PageUtils;
import org.simple.common.utils.Query;

import org.simple.mall.product.dao.CategoryDao;
import org.simple.mall.product.entity.CategoryEntity;
import org.simple.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> categoryTree() {
        //1.查询所有的分类数据
        List<CategoryEntity> allCategoryList=baseMapper.selectList(null);
        //2.组装成父子关系的树型结构
        //2.1 先查询出所有的一级分类数据
        final List<CategoryEntity> rootCategoryList = allCategoryList.stream()
                                                                    .filter(category -> category.getParentCid() == 0)
                                                                    .map(category->{
                                                                        category.setChildren(getChildren(category,allCategoryList));
                                                                        return category;
                                                                    })
                                                                    .sorted((category1,category2)->{
                                                                        return (category1.getSort()==null?0:category1.getSort())-(category2.getSort()==null?0:category2.getSort());
                                                                    })
                                                                    .collect(Collectors.toList());
        return rootCategoryList;
    }

    //递归查找分类菜单的子分类
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> allCategory){
        List<CategoryEntity> children=allCategory.stream()
                                                .filter(child->child.getParentCid().equals(root.getCatId()))
                                                .map(child->{
                                                    //1. 找到子菜单
                                                    child.setChildren(getChildren(child,allCategory));
                                                    return child;
                                                })
                                                    //2.菜单排序
                                                .sorted((category1,category2)->{
                                                   return (category1.getSort()==null?0:category1.getSort())-(category2.getSort()==null?0:category2.getSort());
                                                }).collect(Collectors.toList());
        return children;
    }

}