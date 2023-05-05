package com.mvc.model.service;

import com.mvc.model.javabean.Choose;
import com.mvc.model.javabean.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    public List<Student> findAll() throws SQLException;
    public void add(Student stu) throws SQLException;
    public void update(String uSid, Student stu) throws SQLException;
    public void delete(String delSid) throws SQLException;
    public Object choose(Choose choose) throws SQLException;
}
