<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${pageInfo.list }" var="stu">
			<tr>
				<td>${stu.id }</td>
				<td>${stu.name }</td>
				<td>
					<c:if test="${stu.sex==1 }">男</c:if>
					<c:if test="${stu.sex==2 }">女</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>