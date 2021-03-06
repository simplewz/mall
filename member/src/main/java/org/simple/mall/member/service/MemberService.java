package org.simple.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.simple.common.utils.PageUtils;
import org.simple.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author simple
 * @email 13132398914@163.com
 * @date 2020-12-30 22:14:26
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

