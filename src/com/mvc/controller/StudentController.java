package com.mvc.controller;

import com.mvc.Exception.MyException;
import com.mvc.model.javabean.Choose;
import com.mvc.model.javabean.Student;
import com.mvc.model.service.StudentService;
import com.mvc.model.service.imp.StudentServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/data")
public class StudentController extends HttpServlet {
    //实例化业务层StudentServiceImp
    private StudentService studentService = new StudentServiceImp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        try {
            /*
             * （1）getParameter()获取属性
             * */
            //1.获取执行不同业务的id
            String chooseId = req.getParameter("id");

            //2.获取sid,name,birthday
            String sid = req.getParameter("sid");
            String name = req.getParameter("name");
            String birthdayStr = req.getParameter("birthday");

            //将birthdayStr转换成String---->Date类型
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //这里给Date类型赋当前日期，防止空指针异常
            Date birthday = new Date();
            if (birthdayStr != null){

                birthday = simpleDateFormat.parse(birthdayStr);
            }

            //3.将上面三个数据封装到Student类中
            Student stu = new Student(sid, name, birthday);
            //4.获取uSid和delSid
            String uSid = req.getParameter("uSid");
            String delSid = req.getParameter("delSid");

            /*
             * （2）调用choose()方法进行业务选择
             * */
            //调用studentService的choose()方法进行业务选择
            ArrayList<Student> list =
                    (ArrayList<Student>) studentService.choose(new Choose(chooseId,uSid,delSid,stu));


            /*
             * （3）封装到作用域，跳转
             * */
            //执行完该方法后将list封装到作用域
            req.setAttribute("list", list);
            //跳转
            req.getRequestDispatcher("show.jsp").forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            //e.printStackTrace();
            writer.print("<h1>您输入的学生数据有误！</h1>");
        }
    }
}
