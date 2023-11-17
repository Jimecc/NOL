package com.jim.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * @author Jim
 * @Description
 * @createTime 2023年11月17日
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommandSetEntity {

    private String systemCode;  // 生效系统代码
    private String command;     // 命令
    private String scope;       // 生效范围
    private String pwd;         // 密码
    private int times;

}
