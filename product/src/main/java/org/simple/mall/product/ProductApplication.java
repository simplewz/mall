package org.simple.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合MyBatisPlus
 * 1.导入依赖
 *       <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.1</version>
 *       </dependency>
 * 2.配置
 *  2.1 配置数据源
 *  (1) 导入数据库连接驱动
 *      <dependency>
 *             <groupId>mysql</groupId>
 *             <artifactId>mysql-connector-java</artifactId>
 *             <version>8.0.22</version>
 *      </dependency>
 *  (2)在application.yml配置文件中配置数据源
 *  spring:
 *   datasource:
 *     username: root
 *     password: wangzhao00
 *     url: jdbc:mysql://49.235.2.116:43306/mall_pms?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai
 *     driver-class-name: com.mysql.cj.jdbc.Driver
 *
 *  2.2 配置MyBatisPlus相关信息
 *  (1)在配置类中使用@MapperScan配置mapper接口
 *  (2)在application.yml配置文件中配置MyBatisPlus
 *
 */
@MapperScan("org.simple.mall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
