<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- So here, the anchors are mapped to same Servlet, because using urlPatterns in Servlet's annotations, we can
		 access the same Servlet -->
	
	<a href="test">Start Servlet</a><br><br>
	<a href="anno">Start Servlet</a><br><br>
	<a href="annoServlet">Start Servlet</a><br>

</body>
</html>