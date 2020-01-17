package com.goldenhome.modules.aliyun.service;

import java.util.Map;

/**
 * Created by Sunny on 2020/1/10.
 */

public interface UserViewService {

    Map<String,Object> SmsVerification(String phone);
}
