package com.goldenhome.modules.aliyun.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.goldenhome.config.AliyunConfig;
import com.goldenhome.modules.aliyun.service.UserViewService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sunny on 2020/1/10.
 */
@Service
public class UserViewServiceImpl implements UserViewService {

    /**
     * 短信验证
     * @param phone：手机号
     * @return
     */
    @Override
    public Map<String, Object> SmsVerification(String phone) {
        Map<String, Object> map = new HashMap<>();
        try {
            AliyunConfig.sendSms(phone);
            map.put("code", 200);
            map.put("msg", "短信验证发送成功");
            return map;
        } catch (ClientException e) {
            map.put("code", 300);
            map.put("msg", e.getMessage());
            return map;
        }
    }
}
