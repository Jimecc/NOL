package com.jim.common.entity.Static;

/**
 * @author Jim
 * @Description static类存储当前信息（充当缓存）
 * @createTime 2023年11月17日
 */

public class CommandCache {
    public static int times;         // 请求次数（0是不限制）
    public static String command;       // 命令
    public static String systemCode;    // 生效的系统编码
    public static String scope;         // 生效范围
}
