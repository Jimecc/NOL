package com.jim.nols.service.Impl;

import com.jim.common.entity.CommandReqEntity;
import com.jim.common.entity.CommandRspEntity;
import com.jim.common.entity.CommandSetEntity;
import com.jim.common.entity.Static.CommandCache;
import com.jim.common.enums.CommonRspEnum;
import com.jim.nols.service.CommandService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Jim
 * @Description 命令ServiceImpl
 * @createTime 2023年11月17日
 */
@Service
public class CommandServiceImpl implements CommandService {

    @Value("${sys.pwd}")
    private String pwd;

    @Override
    public CommandRspEntity get(CommandReqEntity entity) {
        CommandRspEntity e = new CommandRspEntity();
        if ("".equals(CommandCache.systemCode) || "".equals(CommandCache.command) || "".equals(CommandCache.scope) || -1 == CommandCache.times){
            return new CommandRspEntity(CommonRspEnum.NO.getCode(), CommonRspEnum.NO.getMsg(), "","","");
        }
        if( 0 == CommandCache.times ){
            // DEL
            CommandCache.times      = -1;
            CommandCache.scope      = "";
            CommandCache.command    = "";
            CommandCache.systemCode = "";
        }
        e.setCommand(CommandCache.command);
        e.setCode(CommandCache.scope);
        e.setScope(CommandCache.scope);
        e.setCode(CommonRspEnum.DO.getCode());
        e.setMsg(CommonRspEnum.DO.getMsg());
        return e;
    }

    @Override
    public CommandRspEntity del(String pwd) {
        if(pwd==null || !pwd.equals(this.pwd))
            return new CommandRspEntity(CommonRspEnum.FA.getCode(),CommonRspEnum.FA.getMsg(),null,null,null);
        CommandCache.times      = -1;
        CommandCache.scope      = "";
        CommandCache.command    = "";
        CommandCache.systemCode = "";
        return null;
    }

    @Override
    public CommandRspEntity set(CommandSetEntity e) {
        if(pwd == null || !pwd.equals(e.getPwd()))
            return new CommandRspEntity(CommonRspEnum.FA.getCode(),CommonRspEnum.FA.getMsg(),null,null,null);
        CommandCache.command = e.getCommand();
        CommandCache.scope = e.getScope();
        CommandCache.systemCode = e.getSystemCode();
        CommandCache.times = e.getTimes();
        return new CommandRspEntity(CommonRspEnum.SU.getCode(),CommonRspEnum.SU.getMsg(),null,null,null);
    }

}
