<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2022/12/5
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <%--这里运用EL表达式和JSTL--%>
    <title>查看学生信息</title>
</head>
<style>
    table,tr,th,td{
        border: 1px solid black;
        text-align: center;
    }
    table{
        width: 50%;
        border-collapse: collapse;
    }

</style>
<body>
<table align="center">
    <tr>
        <th>序号</th>
        <th>学号</th>
        <th>姓名</th>
        <th>出生日期</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.sid}</td>
            <td>${stu.name}</td>
            <td>${stu.birthday}</td>
        </tr>
    </c:forEach>

</table>
<div>
    <p align="center">
        <a href="index.jsp"><button>返回主页面</button></a> &nbsp;&nbsp;
        <a href="add.jsp"><button>添加学生信息</button></a> &nbsp;
        <a href="update.jsp"><button>修改学生信息</button></a> &nbsp;
        <a href="delete.jsp"><button>删除学生信息</button></a> &nbsp;
    </p>
</div>

</body>
</html>
