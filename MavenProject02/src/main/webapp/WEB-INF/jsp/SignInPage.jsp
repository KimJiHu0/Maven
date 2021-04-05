<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SignInPage</h1>
	
	<form action="signinres.do" method="post">
		<table border="1">
		<col width="100">
		<col width="100">
		<tr>
			<th>ID</th>
			<td>
				<input type="text" name="id" placeholder="ID">
			</td>
		</tr>
		<tr>
			<th>PW</th>
			<td>
				<input type="text" name="pw" placeholder="PW">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="submit" value="SignIn">
			</td>
		</tr>
	</table>
	</form>
</body>
</html>