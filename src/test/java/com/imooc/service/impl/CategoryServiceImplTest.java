package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
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
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory result =categoryService.findOne(1);
        Assert.assertNotNull(result);
    }

    @Test
    public void findAll() {
        List<ProductCategory> list=categoryService.findAll();
        Assert.assertTrue(list.size()>0);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> resultList=categoryService.findByCategoryTypeIn(list);
        Assert.assertTrue(resultList.size()>0);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result=categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}