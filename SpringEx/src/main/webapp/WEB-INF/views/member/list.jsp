<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
		<tr>
			<td>ID</td>
			<td>주소</td>
			<td>핸드폰번호</td>
			<td>이메일</td>
			<td>이름</td>
			<td>나이</td>
		</tr>
		<c:forEach items="${memlist}" var="list">
		<tr>
			<td><a href="view?id=${list.id}">${list.id}</a></td>
			<td>${list.addr}</td>
			<td>${list.phone}</td>
			<td>${list.email}</td>
			<td>${list.name}</td>
			<td>${list.age}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>