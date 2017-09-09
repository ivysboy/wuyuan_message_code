package com.wuyuan;

import com.wuyuan.messagecode.ApiCode;
import com.wuyuan.messagecode.impl.CommonCode;

import java.io.Serializable;

/**
 * <p>Description: </p>
 * <pre></pre>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 *
 * @author Laven
 * @date 2016/11/28 14:39
 * @copyright 2015-2016 wuyuan.com All Rights Reserved
 */
public class Result implements ApiCode, Serializable {

    private static final long serialVersionUID = -8415008167082408109L;
    /**
     * 消息码
     */
    private ApiCode apiCode;

    /**
     * 数据
     */
    private Object data;

    public Result(ApiCode apiCode) {
        this.apiCode = apiCode;
    }

    public Result(ApiCode apiCode, Object data) {
        this.apiCode = apiCode;
        this.data = data;
    }


    /**
     * 封装调用  add by xiaoyu
     *
     * @return
     */
    public static Result success() {
        return success("");
    }


    public static Result success(Object data) {
        return get(CommonCode.sussess, data);
    }

    public static Result error() {
        return error(CommonCode.fail);
    }

    /**
     * 响应错误
     *
     * @param apiCode <font color="red">非-1的数</font>
     * @return
     */
    public static Result error(ApiCode apiCode) {
        return get(apiCode, null);
    }

    public static Result get(ApiCode apiCode, Object data) {
        return new Result(apiCode, data);
    }

    @Override
    public Integer getCode() {
        return apiCode.getCode();
    }

    @Override
    public String getMessage() {
        return apiCode.getMessage();
    }

    public Object getData() {
        return data;
    }

}