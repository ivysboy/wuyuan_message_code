package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Description: APP消息码组成：2为系统码 + 2位模块码 + 3位状态码</p>
 * <p>
 * 系统码 - 11
 * </p>
 * <p>
 * 业务码
 * 10 - 广告模块
 * </p>
 * <p>
 * 状态码
 * 1xx - 临时响应
 * 这些状态代码表示请求被接收，需要继续处理。
 * 2xx - 成功
 * 这类状态代码表明服务器成功地接受了客户端请求。
 * 3xx - 重定向
 * 这类状态代码表明客户端需要进一步操作，通常用来重定向。
 * 4xx - 客户端错误
 * 发生错误，客户端似乎有问题。例如，客户端请求参数不存在。
 * 5xx - 服务器错误
 * 服务器由于遇到错误而不能完成该请求。例如，服务端异常
 * 6xx - 参数验证错误
 * 服务端参数验证遇到非法参数。
 * ......
 * </>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 *
 * @author wupengyu
 * @date 2017/1/10 18:08
 * @copyright 2015-2016 wuyuan.com All Rights Reserved
 */
public enum BackgroundCode implements ApiCode {

    /********************供应商模块 10**************************/

    /**********客户端错误4XX**********/
    param_empty(1110400, "参数【{0}】不能为空,请传入【{0}】"),
    NONE_REVIEW_LOG(1110404, "商品没有审核记录"),

    SERVICE_INVENTORY_RESOURCE_INVALID(1110405, "服务人员信息无效"),


    /**********失败操作5XX**********/
    service_provider_locked_out_fail(1110500, "封停/解封供应商失败"),
    get_service_provider_info_fail(1110501, "查询供应商基本信息失败"),
    deletet_service_provider_fail(1110502, "删除供应商失败"),
    update_service_provider_fail(1110503, "更新供应商失败"),
    freight_template_name_is_exist(1110504,"运费模板名称已经存在!"),
    ATTRIBUTE_GROUP_NAME_IS_EXIST(1110505,"属性组名称已经存在"),
    ATTRIBUTE_DEFINE_NAME_IS_EXIST(1110506,"属性组下已经存在相同的属性名称!"),
    GOODS_NAME_IS_EXIST(1110507,"供应商已经存在该商品!"),
    GOODS_ON_SALE_IN_STORE(1110508,"商品已经在店铺中上架"),
    GOOD_TYPE_USED_BY_PROVIDER(1110509,"该品类已关联供应商，不可删除。"),

    SERVICE_PROVIDER_LOCKED_OUT(1110510, "供应商已经被封停"),

    LOGIN_VERIFICATION_CODE_EXPIRED(1110511, "验证码已过期"),

    LOGIN_ACCOUNT_NOT_EXIST(1110512, "账户不存在"),

    LOGIN_ACCOUNT_LOCKED(1110513, "账户被锁定"),

    LOGIN_ACCOUNT_UNACTIVED(1110514, "账户未被激活"),

    ORDER_SHIPPING_UPDATE_FAIL(1110515,"订单物流信息修改失败"),

    LOGIN_ACCOUNT_ERROR(1110516, "用户名或密码错误"),

    PROVIDER_AUTO_RECEIVE_ORDER_SET_FAIL(1110517,"供应商自动接单设置失败"),

    CHANNEL_NAME_IS_EXIST(1110518,"渠道名称已经存在"),

    CHANNEL_APPID_IS_EXIST(1110519,"渠道APPID已经存在"),

    CHANNEL_APP_SECRET_IS_EXIST(1110520,"渠道Secret已经存在"),

    CHANNEL_ACCOUNT_IS_EXIST(1110521,"渠道账号已经存在"),

    GOODS_DIANPING_NAME_IS_EXIST(1110522,"点评商品名称已经存在！"),

    PACKAGE_VIRTUAL_GOODS_IS_EXIST(1110523,"点评渠道次套餐已经关联一条虚拟商品，不能再添加！"),

    PACKAGE_VIRTUAL_GOODS_ONLY_ONE(1110524,"点评渠道套餐只能关联一条商品，不能再添加！"),

    PACKAGE_NOT_ADD_VIRTUAL_GOODS(1110525,"点评渠道套餐已经关联实体商品，不能再添加虚拟商品！"),

    SERVICE_PROVIDER_EXISTED(1110526,"该手机号已绑定供应商，请用原账号登录。若忘记账号请联系客服。"),

    SERVICE_PROVIDER_STILL_RECEVING_ORDER(1110527, "该虚拟商品订单正在派单中/已接单，无法下单哦~"),

    ORDER_STATUS_HAD_BEEN_UPDATE(1110528, "虚拟商品订单状态已更新，请查看是否已接单或已取消"),

    GOODS_OUT_OF_STOCK(1110529, "商品已下架"),

    GOODS_INVALID(1110530, "商品已失效"),

    GOODS_IS_DISABLE(1110531, "商品已删除"),

    GOODS_OUT_OF_QUANTITY(1110532, "商品已售罄"),

    GOODS_STORE_IS_NOT_ON_BUSINESS(1110533, "店铺未营业"),

    GOODS_LACK_OF_QUANTITY(1110534, "库存不足!"),

    DIANPING_PACKAGE_NOT_REL_GOODS(1110535,"点评渠道套餐无对应的真实/虚拟商品，请先添加后再上架！套餐名称为："),

    DIANPING_CLEAN_KEEPING_GOODS_IS_EXIST(1110536,"点评保洁商品已经存在，不能再添加！"),

    STORE_MUST_SET_SERVICEINVENTORY(1110537,"店铺添加商品中存在需要设置店铺服务时间的商品！"),

    SPECIAL_TYPE(1110538,"该虚拟商品的品类必须绑定与其品类一致的真实商品!"),

    DUPLICATE_PHONE_NUMBER(1110539, "重复的电话号码"),

    SAVE_PHONE_FAILED(1110540, "保存失败"),

    DELETE_PHONE_FAILED(1110541, "删除失败"),

    UPDATE_STORE_SERVICETIME_ERROR(1110542, "原营业时间内仍有服务库存存在，请处理后再做设置!"),

    STORE_SERVICE_NAME_IS_EXIST(1110543, "该服务人员信息已存在!"),

    CHANGE_GOOD_TYPE_ERROR(1110544, "非保洁品类不能进行关联!"),

    CAN_NOT_CHANGE_GOODTYPE(1110544,"该商品已经进行关联，不可修改品类!");
    ;

    /**
     * 消息码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    BackgroundCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据value 获取枚举对象
     *  add by xiaoyu
     * @param value 枚举值
     * @return BackgroundCode enum
     */
    public static BackgroundCode getEnum(final Integer value) {
        Optional<BackgroundCode> backgroundCode =
                Arrays.stream(BackgroundCode.values())
                        .filter(v -> Objects.equals(v.getCode(), value))
                        .findFirst();
        return backgroundCode.orElse(null);
    }

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
        if (messageArr.length > 0) {
            for (int i = 0, len = messageArr.length; i < len; i++) {
                message = MessageFormat.format(message, messageArr[i]);
            }
        }
    }
}
