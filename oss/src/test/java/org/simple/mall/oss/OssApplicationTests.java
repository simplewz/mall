package org.simple.mall.oss;


import com.aliyun.oss.OSS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 使用阿里云的oss存储
 * 1. 引入oss-starter
 * 2. 配置oss相关信息，主要配置accessKey accesssKeySecret endpoint bucket
 * 3. 使用配置好的ossClient进行对象的存储的相关操作
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OssApplicationTests {

    @Autowired
    private OSS ossClient;

    @Test
    public void contextLoads() throws FileNotFoundException {
        InputStream inputStream=new FileInputStream("C:\\Users\\simple\\Desktop\\01980\\01980.jpg");
        ossClient.putObject("simpleboo-mall","01980.jpg",inputStream);
        ossClient.shutdown();
    }

}
