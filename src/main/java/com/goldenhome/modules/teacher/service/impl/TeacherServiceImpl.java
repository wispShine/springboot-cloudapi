package com.goldenhome.modules.teacher.service.impl;

import com.goldenhome.common.utils.R;
import com.goldenhome.modules.teacher.dao.TeacherDao;
import com.goldenhome.modules.teacher.entity.TeacherPojo;
import com.goldenhome.modules.teacher.entity.TeachersPojo;
import com.goldenhome.modules.teacher.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

/**
 * Created by Sunny on 2020/1/4.
 */
@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService{


    @Autowired
    private TeacherDao teacherDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public R addTeacher(TeachersPojo teachersPojo) {
        log.info("开始测试！");
        try {
            List<TeacherPojo> teacherPojos = teachersPojo.getTeacherPojos();
            for (TeacherPojo teacherPojo : teacherPojos){
                teacherDao.insertTeacher(teacherPojo);
            }
            log.info("测试结束！");
            return R.ok();
        }catch (Exception e){
            //手动回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error("出现问题:"+e.getMessage());
            return R.error("出现问题:"+e.getMessage());
        }
    }
}
