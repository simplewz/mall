package org.simple.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * nacos作为服务注册发现与配置中心使用示例：
 * 首先需要去下载nacos，并将nacos启动起来。
 *  nacos下载地址：https://github.com/alibaba/nacos/releases
 *  spring-cloud-alibaba spring-cloud springboot 版本对应关系：
 *  https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E
 *
 * 一.如何使用nacos作为注册中心
 * 1. 引入依赖
 *      <dependency>
 *         <groupId>com.alibaba.cloud</groupId>
 *         <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
 *      </dependency>
 * 2.编写nacos作为注册中心的配置
 *      spring:
 *          application:
 *              name: mall-coupon
 *          cloud:
 *              nacos:
 *                  discovery:
 *                      server-addr: 127.0.0.1:8848
 * 3.注解开启服务发现配置
 *     在主配置类上使用@EnableDiscoveryClient开启服务发现功能
 *
 *
 * 二. 如何使用nacos作为配置中心统一管理配置
 * 1. 引入依赖
 *   <dependency>
 *        <groupId>com.alibaba.cloud</groupId>
 *        <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *   </dependency>
 * 2.创建一个bootstrap.properties/bootstrap.yml配置文件,并配置与配置中心有关的配置选项
 *      spring.application.name=mall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3.在配置中心中默认添加一个数据集,数据集默认名称为：应用名.properties(默认规则)
 * 4.在配置文件中添加有关应用的配置选项
 * 5.动态获取配置
 * @RefreshScope：动态获取并刷新配置
 * @Value：${配置项}获取配置
 * 如果应用中的配置文件与配置中心中都配置了同一个配置选项，则优先使用配置中心中的配置项，即配置中心的配置项优先于应用中的配置文件生效
 *
 *  (1)nacos作为配置中心的一些概念
 *  命名空间：用来做配置隔离。
 *      默认命名空间为public(保留空间),默认新增的所有配置都在public空间。
 *      1).开发  测试  生产。利用命名空间来做环境隔离。
 *      注意：需要在bootstrap.yml/bootstrap.properties中明确指出需要使用哪个命名空间下的配置
 *      spring:
 *          cloud:
 *              nacos:
 *                  config:
 *                      server-addr: 127.0.0.1:8848
 *                      namespace: 9ebfd469-2dab-4503-8db5-8a5f9a8e98fb
 *      2).每一个微服务之间互相隔离，每一个微服务都有自己的命名空间,只加载自己命名空间下的所有配置
 *
 *  配置集：一组相关或不相关的配置称为配置集。在系统中，一个配置文件通常就是一个配置集，包含了系统的各个方面的配置。
 *     如一个配置集可能包含了数据源、线程池、日志级别等配置项。
 *  配置集ID：相当于配置文件名。
 *      Data-Id
 *  配置分组
 *      默认所有的配置集都属于：DEFAULT_GROUP
 *
 *  项目配置使用规则：每个微服务创建自己的命名空间，使用配置分组来区分环境。
 *
 *  (2)同时加载多个配置集
 *      1).微服务中的任何配置信息，任何配置文件都可以放在配置中心中
 *      2).只需要在bootstrap.yml/bootstrap.properties配置文件中加载配置中心中的配置文件即可
 *      3).获取配置的属性值可以使用SpringBoot中的@Value、@ConfigurationProperties等获取配置项的注解获取即可。
 *
 * 三. 使用spring-cloud的openfeign进行微服务之间的远程调用
 * 1. 引入依赖
 *     <dependency>
 *          <groupId>org.springframework.cloud</groupId>
 *          <artifactId>spring-cloud-starter-openfeign</artifactId>
 *     </dependency>
 * 2.编写feign接口文件，告知远程调用是调用远程的哪个方法
 * @FeignClient(name = "mall-coupon",url = "127.0.0.1:7000")
 * public interface CouponService {
 *
 *    @RequestMapping("coupon/coupon/list")
 *    public R list(@RequestParam Map<String, Object> params);
 *
 * }
 * 3.在配置类中使用@EnableFeignClients注解扫描feign远程调用组件
 * @SpringBootApplication
 * @MapperScan("org.simple.mall.order.dao")
 * @EnableDiscoveryClient
 * @EnableFeignClients(basePackages = "org.simple.mall.order.feign")
 * public class OrderApplication{
 *
 * }
 */
@SpringBootApplication
@MapperScan("org.simple.mall.coupon.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class CouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);
    }

}
