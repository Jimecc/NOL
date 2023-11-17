package com.jim.nols.controller;

import com.jim.common.entity.CommandRspEntity;
import com.jim.common.entity.CommandSetEntity;
import com.jim.nols.service.CommandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jim
 * @Description 命令请求
 * @createTime 2023年11月17日
 */

@Slf4j
@RestController
@RequestMapping("/com")
public class CommandController {

    @Autowired
    private CommandService service;

    @GetMapping
    public CommandRspEntity get(){
        return null;
    }

    @GetMapping("{pwd}")
    public CommandRspEntity del(@PathVariable("pwd") String pwd){
        log.info("接收到【Del Command】请求{}",pwd);
        return service.del(pwd);
    }

    @PostMapping
    public CommandRspEntity set(CommandSetEntity e){
        log.info("接收到【Set Command】请求{}",e.toString());
        return service.set(e);
    }
}
