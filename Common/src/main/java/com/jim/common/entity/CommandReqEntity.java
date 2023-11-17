package com.jim.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Jim
 * @Description 命令-请求
 * @createTime 2023年11月17日
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommandReqEntity {

    private String targetSystemCode;    // 服务器系统代码s
    private String systemCode;          // 客户端系统代码c

}
