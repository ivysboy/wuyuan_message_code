package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

/**
 * Created by User1 on 2017/2/22.
 */
public enum  FinanceApiCode implements ApiCode {
    /**********成功操作**********/
    sussess(1200200, "操作成功"),
    /**********操作失败**********/
    paramError(1200501, "参数错误"),
    /**********操作失败**********/
    error(1200500, "操作失败");
    private Integer  code;

    private String msg;

    private FinanceApiCode(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }
    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
