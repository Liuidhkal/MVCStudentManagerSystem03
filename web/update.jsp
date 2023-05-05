<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2022/12/5
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生信息</title>
</head>
<body>
<form action="/data" method="post">
    <input type="hidden" name="id" value="3">
    <p>
        要修改的学号：<input type="text" name="uSid">
    </p>
    <p>
        新的学号：<input type="text" name="sid">
    </p>
    <p>
        新的姓名：<input type="text" name="name">
    </p>
    <p>
        新的出生日期：<input type="date" name="birthday">
    </p>
    <input type="submit" value="确认修改">
</form>

</body>
</html>
