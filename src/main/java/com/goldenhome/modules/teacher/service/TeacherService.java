package com.goldenhome.modules.teacher.service;

import com.goldenhome.common.utils.Data;
import com.goldenhome.common.utils.R;
import com.goldenhome.modules.teacher.entity.TeacherPojo;

/**
 * Created by Sunny on 2020/1/4.
 */
public interface TeacherService {

    R addTeacher(Data<TeacherPojo> data);

}
