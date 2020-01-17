package com.goldenhome.modules.teacher.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Sunny on 2020/1/3.
 */

@ApiModel(description = "教师信息")
@Data
public class TeacherPojo{

    @ApiModelProperty(value = "教师ID",required=true)
    private String tId;

    @ApiModelProperty(value = "教师姓名",required=true)
    private String teacherName;

    //隐藏属性名称  hidden = true
    @ApiModelProperty(value = "教师年龄",required=true)
    private String Age;

    @ApiModelProperty(value = "教师教龄",required=true)
    private String teacherD;

}
