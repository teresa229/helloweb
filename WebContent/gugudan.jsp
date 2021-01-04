<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	//HttpServletRequest request = new HttpServletRequest(); 이미 메모리에 준비되는 값
	int dan = Integer.parseInt(request.getParameter("dan")); //정해놓은 변수이름:request 파라미터 무조건 문자열이 되어야 한다. 문자열"dan"
%>   
!-- 칸 안은 자바코드를 넣는다. 담아준다.*
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
	<%for (int i=1; i<=9; i++){%>
		<tr>
			<td><%=dan %></td>
			<td><%=i %></td>
			<td><%=dan*i %></td>
		</tr>
	<%}%>
	</table>
	
</body>
</html>