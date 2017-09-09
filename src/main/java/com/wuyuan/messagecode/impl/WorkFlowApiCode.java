package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

/**
 * <p>Description: 工作流异常信息.</p>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 * <p>Date: 2017/5/8 15:24</p>
 * <p>Copyright: 2016-2017 wuyuan.com All Rights Reserved</p>
 * <p>
 * <p>
 * 系统码 - 13
 *   状态码
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
 * </p>
 * <p>
 * 业务码
 *
 * @author hyq
 */
public enum WorkFlowApiCode implements ApiCode {

    NOT_SERVER_RANGE(1310400,"店铺服务范围不可达"),

    NOT_STOCK_DETECTION(1310401,"库存不足"),

    NOT_SEND_PRICE(1310402,"订单总价达不到起送价"),

    NOT_GOODS_STATUS(1310403,"商品下架或失效"),

    NOT_STORE_STATUS(1310403,"店铺关闭"),

    NOT_FUND_INSTANCE(1311401, "未找到对应流程"),

    BASECOUPON_EMPTY(1311402, "卡券信息参数错误"),

    NOT_VALIDATE_COUPON_INFO(1311403, "获取的卡券信息不合法"),

    NOT_VALIDATE_ADDRESS_ID(1311404, "地址信息非法"),

    NOT_VALIDATE_REGION_CODE(1311405, "行政区ID异常"),

    NOT_VALIDATE_DATA(1311406, "提交数据异常"),

    NOT_VALIDATE_GOODS_PRICE(1311407, "商品价格数据异常"),

    NOT_PROVIDER_STOCK(1311408, "供应商库存不足，请另选时间"),

    NOT_PROVIDER_SERVICE(1311409, "供应商服务暂时无法连接!"),

    ORDER_SOURCE_NOT_CONSISTENT(1311410, "两次提交的订单来源平台不一致"),

    SUBMIT_GOODS_IS_NULL(1311411, "提交的商品数量不能为空"),

    NOT_SERVICE_TIME(1311412, "未传入服务时间"),

    NOT_AVAILABLE_QUANTITY(1311413, "购买数量不符合购买规则"),



    //对接管理后台code3

    NOT_VALIDATE_ORDER_ID(1311420, "无效的订单ID"),

    ORDER_IS_CANCEL(1311500, "订单已取消"),

    NOT_VALIDATE_VIRTUAL_ORDER_ID(1311421, "无效的虚拟订单ID"),

    VIRTUAL_ORDER_IS_CANCEL(1311501, "虚拟订单已取消"),

    NOT_VALIDATE_GOODS_TYPE(1311422, "无效的订单类型"),

    NOT_VALIDATE_ORDER(1311423, "无效订单"),

    NOT_VALIDATE_INPUT_PARAMETER(1311424, "无效的输入参数"),

    PARTIAL_ORDERS_FAILED(1311425, "部分订单取消失败"),

    NOT_VALIDATE_SERVICE_INFO(1311426, "无效的订单服务信息"),

    NOT_VALIDATE_ORDER_STATUS(1311427, "无效的订单状态"),

    NOT_VALIDATE_WAITER(1311428, "该服务人员无法选择"),

    NOT_VALIDATE_SERVICE_TIME(1311429, "该商品的品类无法选择服务时间"),

    NOT_COMPELETED_INPUT_WAITER(1311430, "还未录入服务人员"),

    NOT_VALIDATE_TIME_STOCK(1311431, "服务库存不足"),

    CAN_NOT_INPUT_SAME_WAITER(1311432, "所选阿姨已服务当前订单"),

    NOT_VALIDATE_WAITER_SERVICE_RANGE(1311433, "服务人员服务范围覆盖不到该服务地址");






    /**
     * 消息码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    WorkFlowApiCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
