package com.goldenhome.modules.aliyun.controller;

import com.goldenhome.modules.aliyun.service.UserViewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sunny on 2020/1/10.
 */
@RestController
@RequestMapping("/sunshine")
@Api(tags = "阿里云短信")
public class UserViewController {

    @Autowired
    private UserViewService userViewService;

    @GetMapping("/smsverification/{phone}")
    @ApiOperation("发送验证码")
    public Object SmsVerification(@PathVariable("phone") String phone) {
        return userViewService.SmsVerification(phone);
    }
}
