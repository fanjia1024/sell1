package com.imooc.VO;

import lombok.Data;

/**
 * 返回给前端的最外层的对象
 * @param <T>
 */
@Data
public class ResultVo<T> {
    /** 错误码.*/
    private Integer code;
    /** 信息.*/
    private String msg;
    /** 对象.*/
    private T object;


}
