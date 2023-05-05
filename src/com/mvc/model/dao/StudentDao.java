package com.mvc.model.dao;

import com.mvc.model.javabean.Student;

import java.sql.SQLException;
import java.util.List;

/*
* 该Dao接口中实现增删改查的方法
* */
public interface StudentDao {
    //查看，返回list
    public List<Student> findAll() throws SQLException;
    //添加
    public void add(Student stu) throws SQLException;
    //修改
    public void update(String uSid, Student stu) throws SQLException;
    //删除
    public void delete(String delSid) throws SQLException;

}
