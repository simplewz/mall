package org.simple.mall.member.dao;

import org.simple.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:14:26
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
