package com.mvc.model.dao.imp;

import com.mvc.model.dao.StudentDao;
import com.mvc.model.javabean.Student;
import com.mvc.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/*
* 在这个实现类中实现增删改查
* */
public class StudentDaoImp implements StudentDao {
    private QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());

    @Override
    public List<Student> findAll() throws SQLException {//查看
        String sql = "select * from student";
        List<Student> list = qr.query(sql, new BeanListHandler<Student>(Student.class));
        return list;
    }

    @Override
    public void add(Student stu) throws SQLException {//添加
        String sql = "insert into student values(?,?,?,?)";

        //获取birthday并将Date--->String类型
        Date birthdayDate = stu.getBirthday();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(birthdayDate);

        Object[] param = {null, stu.getSid(), stu.getName(), birthday};
        qr.update(sql, param);
     /*
     * 这里可以留个异常，如果返回值不为1，则手动抛出异常
     * */

    }

    @Override
    public void update(String uSid, Student stu) throws SQLException {
        String sql = "update student set sid = ?, name = ?, birthday = ? where sid = ?";

        //获取birthday并将Date--->String类型
        Date birthdayDate = stu.getBirthday();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(birthdayDate);

        Object[] param = {stu.getSid(), stu.getName(), birthday, uSid};
        qr.update(sql, param);

    }

    @Override
    public void delete(String delSid) throws SQLException {
        String sql = "delete from student where sid = ?";
        qr.update(sql, delSid);

    }
}
