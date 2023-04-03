<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<form method="post">
	<table border= "1">
		<tr>
			<td>이름</td>
			<td>
				<input type="text" value="${view.name}" name="name">
			</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>
			${view.id}<input type="hidden" value="${view.id}" name="id" >
			</td>
		</tr>
		<tr>
			<td>password</td>
			<td>
			<input type="password" value="${view.password}" name="password">
			</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${view.age}</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>
			<input type="text" value="${view.addr}">
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
			<input type="text" value="${view.email}" name="email">
			</td>
		</tr>
		<tr>
			<td>폰번호</td>
			<td>
			<input type="text" value="${view.phone}" name="phone">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="수정" formaction="modify">
				<input type="submit" value="삭제" formaction="remove">
			</td>
		</tr>
	</table>
</form>
</body>
</html>