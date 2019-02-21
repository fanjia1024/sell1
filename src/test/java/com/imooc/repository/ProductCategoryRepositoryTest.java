package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;




    @Test
//    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 2);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
//        log.info("执行成功！！");
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void updateTest() {
//        ProductCategory productCategory = repository.findOne(4);
//        productCategory.setCategoryName("男生最爱1");
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertEquals(productCategory, result);
    }
}