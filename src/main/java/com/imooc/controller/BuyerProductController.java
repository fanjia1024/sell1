package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVo;
import com.imooc.VO.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @GetMapping("/list")
    public ResultVo list(){
        ResultVo resultVo=new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        ProductInfoVO productInfoVO=new ProductInfoVO();
        productInfoVO.setProductDescription("神仙打架");
        ProductVo productVo=new ProductVo();
        productVo.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVo.setObject(productVo);
        return resultVo;
    }

}
