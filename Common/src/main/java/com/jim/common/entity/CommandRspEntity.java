package com.jim.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Jim
 * @Description 命令-返回
 * @createTime 2023年11月17日
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommandRspEntity {

    /**
     * 可能出现的情况
     * 1-x-1 (1号系统生效)
     * 0-x-0 (所有系统生效)
     * H-x-2 (所有代号“H”范围内系统生效)
     */
    private String code;        // 返回码
    private String msg;         // 返回信息
    private String systemCode;  // 生效系统代码
    private String command;     // 命令
    private String scope;       // 范围

}
