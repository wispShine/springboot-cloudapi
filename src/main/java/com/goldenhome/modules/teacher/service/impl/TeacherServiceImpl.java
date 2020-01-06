package com.goldenhome.modules.teacher.service.impl;

import com.goldenhome.common.utils.R;
import com.goldenhome.modules.teacher.dao.TeacherDao;
import com.goldenhome.modules.teacher.entity.TeacherPojo;
import com.goldenhome.modules.teacher.service.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

/**
 * Created by Sunny on 2020/1/4.
 */
@Service
public class TeacherServiceImpl implements TeacherService{

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TeacherDao teacherDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public R addTeacher(List<TeacherPojo> teacherPojos) {
        logger.info("开始测试！");
        try {
            for (TeacherPojo teacherPojo : teacherPojos){
                teacherDao.insertTeacher(teacherPojo);
            }
            logger.info("测试结束！");
            return R.ok();
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            logger.error("出现问题:"+e.getMessage());
            return R.error("出现问题:"+e.getMessage());
        }
    }
}
