package com.goldenhome.modules.teacher.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.goldenhome.common.utils.R;
import com.goldenhome.modules.teacher.entity.TeacherPojo;
import com.goldenhome.modules.teacher.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sunny on 2020/1/4.
 */
@RestController
@RequestMapping("/test")
public class TeacherController {
    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    @RequestMapping("/insert")
    public R add(@RequestBody String data){
        //json字符串转list
        JSONObject jsonObject = JSONObject.parseObject(data);
        JSONArray teachers = jsonObject.getJSONArray("teachers");
        List<TeacherPojo> teacherPojos = JSONArray.parseArray(teachers.toJSONString(), TeacherPojo.class);
        return teacherService.addTeacher(teacherPojos);
    }

}
