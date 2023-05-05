<%--
  Created by IntelliJ IDEA.
  User: 86156
  Date: 2022/12/5
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除学生信息</title>
</head>
<body>
<form action="/data" method="post">
    <input type="hidden" name="id" value="4">
    <p>
        要删除的学号：<input type="text" name="delSid">
    </p>
    <input type="submit" value="确认删除">
</form>

</body>
</html>
