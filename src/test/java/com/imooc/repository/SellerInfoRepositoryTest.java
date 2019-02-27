package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import com.imooc.utils.KeyUtil;
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
public class SellerInfoRepositoryTest {
    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void saveTest() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setOpenid("1233444");
        sellerInfo.setPassword("123456");
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("fanjia");
        SellerInfo result = repository.save(sellerInfo);
        Assert.assertTrue(result != null);
    }

    @Test
    public void findByOpenidTest() {
        SellerInfo sellerInfo = repository.findByOpenid("1233444");
        log.info("【当前查询的数据是 】sellerInfo={}", sellerInfo);
        Assert.assertTrue("1233444".equals(sellerInfo.getOpenid()));
    }

    @Test
    public void login() {
        String username = "fanjia";
        String password = "123456";
        SellerInfo sellerInfo = repository.findByUsernameAndPassword(username, password);
        Assert.assertTrue(sellerInfo != null);
    }
}