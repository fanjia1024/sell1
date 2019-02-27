package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerSerivceImplTest {
    @Autowired
    private SellerSerivceImpl sellerSerivce;

    private static final String OPENID = "1233444";

    @Test
    public void findSellerInfoByOpenid() {
        SellerInfo result = sellerSerivce.findSellerInfoByOpenid(OPENID);
        log.info("【当前请求到的数据是】result={}", result);
        Assert.assertTrue(result != null);

    }
}