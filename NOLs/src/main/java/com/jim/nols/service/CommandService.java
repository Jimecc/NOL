package com.jim.nols.service;

import com.jim.common.entity.CommandReqEntity;
import com.jim.common.entity.CommandRspEntity;
import com.jim.common.entity.CommandSetEntity;

/**
 * @author Jim
 * @Description 命令Service
 * @createTime 2023年11月17日
 */
public interface CommandService {

    // 获取当前的命令
    CommandRspEntity get(CommandReqEntity e);
    // 删除当前命令
    CommandRspEntity del(String pwd);
    // 设置（修改）命令
    CommandRspEntity set(CommandSetEntity e);

}
