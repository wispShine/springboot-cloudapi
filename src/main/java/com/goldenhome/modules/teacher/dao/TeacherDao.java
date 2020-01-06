package com.goldenhome.modules.teacher.dao;

import com.goldenhome.modules.teacher.entity.TeacherPojo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Sunny on 2020/1/4.
 */
@Mapper
public interface TeacherDao {

    void insertTeacher(TeacherPojo teacherPojo);
}
