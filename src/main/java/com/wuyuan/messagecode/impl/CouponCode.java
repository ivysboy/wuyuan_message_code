package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

/**
 * <p>Description: 优惠券消息码组成：2为系统码 + 2位模块码 + 3位状态码</p>
 * <p>
 *     系统码 - 15
 * </p>
 * <p>
 *     业务码
 * 10 - 领取优惠券
 * </p>
 * <p>
 *     状态码
 * 1xx - 临时响应
 *     这些状态代码表示请求被接收，需要继续处理。
 * 2xx - 成功
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
 * </>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 * <p>Date: 2017-05-25.</p>
 */
public enum CouponCode implements ApiCode {


    /********************领取优惠券 10**************************/

    /**********成功**********/
    get_limit(1510202, "领取已达到上限"),



    /**********客户端错误4XX**********/
    coupon_error(1510401,"卡券未开启或卡券已过期或卡券已领完"),
    get_zero_limit(1510403,"该优惠券用户一次性只能领取0张"),
    User_does_not_exist(1510404, "该用户不存在"),
    param_empty(1510405, "优惠券信息或者 手机号为空"),
    can_not_find_coupon(1510406, "无法找到优惠券"),
    inventory_shortage(1510407,"卡券数量不足"),




    /**********失败操作5XX**********/

    get_service_provider_info_fail(1110501, "查询供应商基本信息失败"),






    ;

    CouponCode(Integer code, String message) {
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
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
