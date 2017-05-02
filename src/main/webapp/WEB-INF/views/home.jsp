<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Windows to Unix Path Converter</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="<c:url value="/resources/js/win2unix.js"/>"></script>
</head>
<body>
	<div id="container">
<!--   		<h2>Convert DOS to UNIX address<span style="color: #c40000; float: right;">#GET</span></h2> -->
   		<h2>Convert Windows to Unix path<span style="color: #c40000; float: right;">#POST</span></h2>
 		<form id="pathForm">
		<div>
			<label for="winPath">Windows Path</label> <input type="text"
				name="winPath" id="winPath" />
		</div>
		<div>
			<label for="unixPath">Unix Path</label> 
			<textarea rows="7" cols="98" spellcheck="false" id="unixPath"></textarea>
		</div>
		<!-- GET Method -->
<!--    		<button type="button" id="win2unixButton">Convert DOS to UNIX</button> -->
		<!-- POST Method -->
   		<div><input id="submit" type="submit" value="Convert DOS to UNIX"></div>
		</form>
	</div>
</body>
</html>