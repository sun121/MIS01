<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加用户</title>
	<script type="text/javascript">
	function addUser(){
		var form = document.forms[0];
		form.action = "<%=basePath%>user/addUser.html";
		form.method="post";
		form.submit();
	}
</script>

  </head>
  
  <body>
    <h1>添加用户</h1>
	<form action="" name="userForm">
		姓名：<input type="text" name="name">
		邮箱：<input type="text" name="email">
		密码：<input type="password" name="loginPassword">
		<input type="radio" name="sex" value="1" checked="checked">男
		<input type="radio" name="sex" value="0">女
		<input type="button" value="添加" onclick="addUser()">
	</form>
  </body>
</html>
