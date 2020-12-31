package org.simple.mall.order.feign;

import java.util.Map;

import org.simple.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "mall-coupon",url = "127.0.0.1:7000")
public interface CouponService {
	
	@RequestMapping("coupon/coupon/list")
	public R list(@RequestParam Map<String, Object> params);
	
}
