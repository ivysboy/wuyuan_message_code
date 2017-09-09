package com.wuyuan.messagecode;

/**
 * <p>Description: 消息码</p>
 * <pre>
 *     消息码组成：2为系统码 + 2位模块码 + 3位状态码
 * </pre>
 * <pre>
 *     系统码
 * 10 - app-background
 * 11 - background-manage
 * 12 -
 * </pre>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 *
 * @author Laven
 * @date 2016/11/28 12:13
 * @copyright 2015-2016 wuyuan.com All Rights Reserved
 */
public interface ApiCode {

    /**
     * 获取消息码
     *
     * @return 消息码
     */
    Integer getCode();

    /**
     * 获取消息
     *
     * @return 消息
     */
    String getMessage();
}
