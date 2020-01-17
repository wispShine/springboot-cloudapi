package com.goldenhome.modules.teacher.controller;

import com.alibaba.fastjson.JSONObject;
import com.goldenhome.common.utils.R;
import com.goldenhome.modules.teacher.entity.TeacherPojo;
import com.goldenhome.modules.teacher.entity.TeachersPojo;
import com.goldenhome.modules.teacher.service.TeacherService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sunny on 2020/1/4.
 */
@RestController
@RequestMapping("/test")
@Api(tags = "教师信息操作")
@Slf4j
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/teacher")
    @ApiOperation("批量新增教师信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "查询成功返回信息", response = R.class)
    })
    public R add(@RequestBody TeachersPojo data){
        //json字符串转list
        /*JSONObject jsonObject = JSONObject.parseObject(data);
        JSONArray teachers = jsonObject.getJSONArray("teachers");
        List<TeacherPojo> teacherPojos = JSONArray.parseArray(teachers.toJSONString(), TeacherPojo.class);*/
        System.out.println("222222"+data);
        String json = JSONObject.toJSONString(data);
        System.out.println("11111"+json);
        return null;
        //return teacherService.addTeacher(data);
    }

    @PutMapping("/teacher/{tId}/{tName}")
    @ApiOperation("修改教师信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "查询成功返回信息", response = R.class)
    })
    public R update(@PathVariable("tId") String id,@PathVariable String tName){
        System.out.println(id);
        System.out.println(tName);
        return R.ok();
    }

    @GetMapping("/teacher/{tId}")
    @ApiOperation("根据Id查询教师信息")
    @ApiImplicitParam(name = "tId",value = "教师id",dataType = "string",paramType = "path",required = true,example = "007")
    @ApiResponses({
            @ApiResponse(code = 200, message = "查询成功返回信息", response = R.class)
    })
    public R query(@PathVariable("tId") String id){
        System.out.println(id);
        return R.ok();
    }

    @GetMapping("/teacher")
    @ApiOperation("查询所有教师信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "查询成功返回信息",response = R.class),
            @ApiResponse(code = 500, message = "查询失败返回信息",response = TeacherPojo.class)
    })
    public R queryAll(){
        log.info("开始查询！");
        return R.ok();
    }

}
