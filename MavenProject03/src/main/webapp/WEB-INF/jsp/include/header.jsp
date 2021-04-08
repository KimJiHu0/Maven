<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

	function ChangeLanguage(){
		var lang = $('#changelang').val();
		location.href='changelang.do?lang='+lang;
	}
	
</script>

<header>
	<h1 align="center" style="color:pink;">Header.jsp</h1>
	
	<select id="changelang" onchange="ChangeLanguage()">
		<option><spring:message code="select.lang"/></option>
		<option value="ko"><spring:message code="select.lang.ko"/></option>
		<option value="en"><spring:message code="select.lang.en"/></option>
	</select>
</header>