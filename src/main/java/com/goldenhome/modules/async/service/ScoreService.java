package com.goldenhome.modules.async.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Sunny on 2020/1/8.
 */
@Service
@Slf4j
public class ScoreService {

    @Async
    public void addScore(){
        //TODO 模拟睡眠5秒，用于赠送积分处理
        try{
            Thread.sleep(5000);
            log.info("------1------处理积分------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Async("scorePoolTaskExecutor")
    public void addScore2(){
        //TODO 模拟睡眠5秒，用于赠送积分处理
        try {
            Thread.sleep(5000);
            log.info("-----2-----积分处理-----------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Async("scorePoolTaskExecutor2")
    public void addScore3(){
        //TODO 模拟睡眠5秒，用于赠送积分处理
        try{
            Thread.sleep(5000);
            log.info("------3------处理积分------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
