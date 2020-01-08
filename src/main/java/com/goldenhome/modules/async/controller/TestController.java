package com.goldenhome.modules.async.controller;

import com.goldenhome.modules.async.service.ScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sunny on 2020/1/8.
 */
@RestController
@Slf4j
@Api(tags = "Async的使用")
public class TestController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping("/sync")
    @ApiOperation("随机")
    public String creatUser(){
        log.info("---------注册用户-------");
        scoreService.addScore();
        return "OK";
    }

    @PostMapping("/sync2")
    @ApiOperation("Async实现自定义线程池")
    public String creatUser2(){
        log.info("---------注册用户-------");
        scoreService.addScore2();
        return "OK";
    }

    @PostMapping("/sync3")
    @ApiOperation("Async实现自定义线程池")
    public String creatUser3(){
        log.info("---------注册用户-------");
        scoreService.addScore3();
        return "OK";
    }
}
