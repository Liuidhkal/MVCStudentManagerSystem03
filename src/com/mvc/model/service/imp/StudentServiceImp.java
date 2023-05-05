package com.mvc.model.service.imp;

import com.mvc.model.dao.StudentDao;
import com.mvc.model.dao.imp.StudentDaoImp;
import com.mvc.model.javabean.Choose;
import com.mvc.model.javabean.Student;
import com.mvc.model.service.StudentService;

import java.sql.SQLException;
import java.util.List;
/*
* 这是业务层，在这里执行业务操作
* */
public class StudentServiceImp implements StudentService {
    private StudentDao studentDao = new StudentDaoImp();
    @Override
    public List<Student> findAll() throws SQLException {
        //查询
        return studentDao.findAll();
    }

    @Override
    public void add(Student stu) throws SQLException {
        //添加
        studentDao.add(stu);

    }

    @Override
    public void update(String uSid, Student stu) throws SQLException {
        //修改
        studentDao.update(uSid, stu);

    }

    @Override
    public void delete(String delSid) throws SQLException {
        //删除
        studentDao.delete(delSid);

    }

    @Override
    public Object choose(Choose choose) throws SQLException {
        //获取chooseId
        String chooseId = choose.getChooseId();
        //获取stu
        Student stu = choose.getStu();
        //获取uSid
        String uSid = choose.getuSid();
        //获取delSid
        String delSid = choose.getDelSid();

        //在这里执行业务选择
        if (chooseId.equals("1")){
            //查看
            return findAll();
        } else if (chooseId.equals("2")){
            //添加
            add(stu);
            //添加完成 执行查看
            return findAll();
        } else if (chooseId.equals("3")){
            //修改
            update(uSid, stu);
            //修改完成后 执行查看
            return findAll();

        } else if (chooseId.equals("4")){
            //删除
            delete(delSid);
            //删除完成后 执行查看
            return findAll();
        }
        return null;
    }
}
