package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

/**
 * <p>Description: APP消息码组成：2为系统码 + 2位模块码 + 3位状态码</p>
 * <p>
 *     系统码 - 12
 * </p>
 * <p>
 *     业务码
 * 10 - 基础模块
 * 11 - 用户模块
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
 * <p>Date: 2016/11/28 12:16</p>
 * <p>Copyright 2015-2016 wuyuan.com All Rights Reserved</p>
 *
 * @author Laven
 */
public enum AppApiCode implements ApiCode {

    /********************用户模块 10**************************/

    /********** 3 **********/

    /**********客户端错误4XX**********/
    user_id_null(1210400, "用户ID为空！"),
    user_phone_null(1210401, "用户手机号为空！"),
    user_not_found(1210402, "用户不存在"),
    user_delivery_address_id_not_found(1210403, "用户收货地址ID为空"),
    user_terminal_version_null(1210404, "用户终端版本号为空"),
    user_sys_version_null(1210405, "系统版本号为空"),
    user_pro_version_null(1210406, "产品版本号为空"),
    user_feedback_detail_null(1210407, "用户反馈内容为空"),
    goods_shop_id_null(1210408, "店铺ID为空"),
    goods_poi_id_null(1210409, "定位地址，poiId为空"),
    goods_id_null(1210410,"商品ID为空"),
    goods_type_null(1210411,"商品类型为空"),
    advertisement_img_null(1210412, "广告图片为空"),
    advertisement_url_null(1210413, "广告跳转链接为空"),
    advertisement_time_null(1210414, "广告起止时间为空"),
    advertisement_showInterval_null(1210415, "广告播放时间为空"),
    order_store_list_null(1210416, "订单店铺列表数据为空"),
    order_list_empty(1210417, "订单列表为空"),
    // ......
    /**********失败操作5XX**********/
    user_operation_fail(1210500, "用户操作失败"),
    add_user_fail(1210501, "创建用户失败"),
    get_user_info_fail(1210502, "获取用户信息失败"),
    get_user_list_fail(1210503, "获取用户列表失败"),
    modify_user_info_fail(1210504, "更新个人信息失败"),
    user_login_fail(1210505, "用户登录失败"),

    add_user_service_address_fail(1210506, "添加用户服务地址失败"),
    get_user_service_address_list_fail(1210507, "获取一页用户服务地址失败"),

    get_user_delivery_address_list_fail(1210508, "获取用户收货地址列表失败"),
    get_user_delivery_address_info_fail(1210509, "获取用户收货地址详情失败"),
    add_user_delivery_address_fail(1210510, "添加用户收货地址失败"),
    modify_user_delivery_address_fail(1210511, "修改用户收货地址失败"),
    delete_user_delivery_address_fail(1210512, "删除用户收货地址失败"),

    user_name_has_exist(1210513, "账户名已经被使用，请重新输入"),
    order_submit_info_show_fail(1210514,"当前商品或服务暂不支持"),
    order_submit_action_fail(1210515, "订单提交失败"),
    city_list_query_fail(1210516, "查询城市列表失败"),
    order_list_query_fail(1210517, "订单列表查询失败"),
    shopping_cart_invaild_good(1210518, "商品信息无效"),
    shopping_cart_cannot_delivery(1210519, "商品不支持在当前地区购买"),
    shopping_cart_buy_count_limited(1210520, "该商品只可购买一件"),
    shopping_cart_good_out_stock(1210521, "商品库存不足"),
    shopping_cart_insert_error(1210522, "商品存储失败, 请检查您的商品信息是否有误"),
    order_submit_delivery_change_fail(1210523, "订单的配送信息更改失败"),
    order_submit_coupon_change_fail(1210524, "订单使用优惠券失败"),

    user_service_address_address_invalid(1210525, "收货地址地址信息无效"),
    user_service_address_contact_phone_invalid(1210526, "收货地址联系人信息无效"),
    shopping_cart_out_of_max_sum(1210527, "1次最多买999件"),
    xzb_balance_fail(1210528, "旺财数据获取失败"),
    order_submit_goods_invalid(1210529, "商品下架、售罄或失效"),
    out_of_max_available_count(1210530, ""),
    store_closed(1210531, "该店铺已关闭"),
    administrative_region_invalid(1210532, "很抱歉，我们暂时无法为您所在地区提供服务"),
    no_service_at_reservation_time(1210533, "很抱歉，您预约的时间暂无人员为您服务"),
    // ......

    /**********非法操作6XX**********/
    user_xxx_error(1210600, ""),
    user_phone_error(1210601, "非法手机号"),
    user_phone_code_error(1210602, "手机验证码错误"),
    user_phone_code_imexpire(1210606,"手机验证码过期"),
    user_is_not_in_white_list(1210603, "用户不在白名单中"),
    toomuch_photo_error(1210604, "添加过多图片"),
    params_error(1210605, "传入参数错误"),
    user_service_address_too_much(1210606, "服务地址数量过多，新增服务地址失败"),
    location_tansfer_to_towncode_error(1210607, "定位不到行政区！"),

    advertisement_time_error(1210608, "广告起止日期有误"),
    advertisement_insert_error(1210609, "广告插入错误"),
    order_delete_error(1210610, "该状态下的订单不能进行删除操作"),
    order_submit_sending_price_error(1210611, "不满起送价，请联系客服下单！"),
    order_is_not_pending_payment_error(1210612, "订单不处在待付款状态，无法支付"),
    order_submit_timeout_error(1210613, "停留时间过长，请重新购买"),
    order_operation_invalid(1210614, "当前订单不允许进行该操作"),
    // ......

    /********** 7... **********/


    /********************商品模块 11**************************/
    GoodsNotJoinPriceCompare(1211400,"该商品没有参与全网最低价"),


    ;

    AppApiCode(Integer code, String message) {
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

    /**
     * 替换消息中的占位符
     * 参数{0}不能为空，{1}
     * <p>
     * demo如下
     * <p>
     * 枚举值为：param_empty(1110400, "参数{0}不能为空,{1}");
     * <p>
     * BaseServiceCode param_empty = BaseServiceCode.param_empty;
     * param_empty.setMessage("id","请传入id");
     * System.out.print(param_empty.getMessage());
     * <p>
     * 输出结果：参数id不能为空,请传入id
     *
     * @param messageArr
     */
    public void setMessage(String... messageArr) {
        if(messageArr.length > 0) {
                this.message = messageArr[0];
        }
    }
}
