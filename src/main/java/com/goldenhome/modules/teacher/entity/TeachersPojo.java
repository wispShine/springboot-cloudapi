package com.goldenhome.modules.teacher.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Sunny on 2020/1/9.
 */
@Data
public class TeachersPojo {

    @ApiModelProperty(value = "教师信息",required=true)
    private List<TeacherPojo> teacherPojos;
}
