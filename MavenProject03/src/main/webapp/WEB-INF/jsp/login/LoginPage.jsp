<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<%@include file="/WEB-INF/jsp/taglib/taglib.jspf" %>
<html>
<head>
<meta charset="UTF-8">
<title>LoginPage</title>
</head>
<body>

	<%@include file="/WEB-INF/jsp/include/header.jsp" %>

	<h2><spring:message code="login.title.name" text="사용할 수 없는 사용코드입니다."/></h2>
	
	<table border="1">
		<col width="100">
		<col width="100">
		<tr>
			<th>ID</th>
			<td>
				<input type="text" placeholder="<spring:message code="login.form.id"/>">
			</td>
		</tr>
		<tr>
			<th>PW</th>
			<td>
				<input type="text" placeholder="<spring:message code="login.form.pw"/>">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<button onclick="location.href='signin.do'">SignIn</button>
			</td>
		</tr>
	</table>
</body>
</html>