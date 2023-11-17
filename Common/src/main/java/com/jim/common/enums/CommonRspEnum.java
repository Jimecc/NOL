package com.jim.common.enums;

/**
 * @author Jim
 * @Description 通用返回代码
 * @createTime 2023年11月17日
 */
public enum CommonRspEnum {
    DO("D00000","当前有命令可执行"),
    NO("N00000","当前无命令可执行"),
    SU("SU0000","执行成功"),
    FA("FA0000","执行失败");

    private String code;
    private String msg;

    CommonRspEnum(String code,String msg){
        this.code = code;
        this.msg  = msg;
    }

    public String getCode(){ return code;}
    public String getMsg() { return msg; }

}
