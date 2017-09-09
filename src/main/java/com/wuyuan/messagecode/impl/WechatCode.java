package com.wuyuan.messagecode.impl;

import com.wuyuan.messagecode.ApiCode;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by xuwuyuan on 2017/9/7.
 */
public enum WechatCode implements ApiCode {

    SERVICE_RETURN_ERROR(1111500, ""),
    PARAMETER_ERROR(1111501, "参数错误"),
    BIND_PROVIDER_ERROR(1111502, "绑定供应商失败"),
    BIND_STORE_ERROR(1111503, "绑定店铺失败")
    ;

    /**
     * 消息码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    WechatCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 根据value 获取枚举对象
     *  add by xiaoyu
     * @param value 枚举值
     * @return BackgroundCode enum
     */
    public static WechatCode getEnum(final Integer value) {
        Optional<WechatCode> wechatCode =
                Arrays.stream(WechatCode.values())
                        .filter(v -> Objects.equals(v.getCode(), value))
                        .findFirst();
        return wechatCode.orElse(null);
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
