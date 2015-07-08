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
    
    <title>编辑用户</title>
    
	<script type="text/javascript">
	function updateUser(){
		var form = document.forms[0];
		form.action = "<%=basePath%>user/updateUser.html";
		form.method="post";
		form.submit();
	}
</script>

  </head>
  
  <body>
    <h1>修改用户</h1>
	<form action="" name="userForm">
		<input type="hidden" name="id" value="${user.id }"/>
		<input type="hidden" name="tel" value="${user.tel }"/>
		<input type="hidden" name="state" value="${user.state }"/>
		<input type="hidden" name="createrId" value="${user.createrId }"/>
<%-- 		<input type="hidden" name="createDate" value="${user.createDate }"/> --%>
		<input type="hidden" name="isAdmin" value="${user.isAdmin }"/>
		姓名：<input type="text" name="name" value="${user.name }">
		邮箱：<input type="text" name="email"  value="${user.email }">
		密码：<input type="password" name="loginPassword"  value="${user.loginPassword }">
		性别：
		<c:if test="${user.sex==1 }">
			<input type="radio" name="sex" value="1" checked="checked">男
			<input type="radio" name="sex" value="0">女
		</c:if>
		<c:if test="${user.sex==0 }">
			<input type="radio" name="sex" value="1" >男
			<input type="radio" name="sex" value="0" checked="checked">女
		</c:if>
		<input type="button" value="编辑" onclick="updateUser()"/>
	</form>
  </body>
  
</html>
