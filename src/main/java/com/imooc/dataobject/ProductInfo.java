package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {
    @Id
    private  String productId;
    /** 商品名称 。*/
    private String productName;
    /** 商品价格 。*/
    private BigDecimal productPrice;
    /** 商品库存 。*/
    private  Integer productStock;
    /** 商品描述 。*/
    private String  productDescription;
    /** 商品图标 。*/
    private String productIcon;
    /** 商品状态  0在架 1 下架。*/
    private Integer productStatus;
    /** 类目类型 。*/
    private Integer categoryType;
}
