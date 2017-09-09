package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

/**
 * <p>Description: 通用消息码组成：2为系统码(通用) + 2位模块码(通用) + 3位状态码(通用).</p>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 * <p>
 *     (通用)系统码 - 10
 * </p>
 * <p>
 *     业务码
 * 00 - 通用模块
 * </p>
 * <p>
 *     状态码
 * 1xx - 临时响应
 *     这些状态代码表示请求被接收，需要继续处理。
 * 200 - 成功
 *     这类状态代码表明服务器成功地接受了客户端请求。
 * 3xx - 重定向
 *     这类状态代码表明客户端需要进一步操作，通常用来重定向。
 * 4xx - 客户端错误
 *     发生错误，客户端似乎有问题。例如，客户端请求参数不存在。
 * 5xx - 服务器错误
 *     服务器由于遇到错误而不能完成该请求。例如，服务端异常
 * 6xx - 参数验证错误
 *     服务端参数验证遇到非法参数。
 * ......
 * <p>Date: 2017/2/8 10:59</p>
 * <p>Copyright: 2015-2016 wuyuan.com All Rights Reserved</p>
 *
 * @author Laven
 */
public enum  CommonCode implements ApiCode {

    /********************通用 00**************************/
    /**********成功操作**********/
    sussess(1000200, "操作成功"),

    /**********重定向**********/
    redirect(1000300, "重定向"),

    /**********客户端错误**********/
    not_found(1000400, "请求参数有误"),

    /**********成功失败**********/
    fail(1000500, "操作失败")



    ;

    CommonCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 消息码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
