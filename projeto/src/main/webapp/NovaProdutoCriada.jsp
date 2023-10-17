<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Criação de Produto</title>
</head>
<body>
	
	<c:choose>
		<c:when test="${empty nomeProduto}">
	        <p>Produto não cadastrada!!!!.</p>
	    </c:when>
	    <c:otherwise>
	        <p>Produto ${nomeProduto} Criada com sucesso</p>
	    </c:otherwise>
    </c:choose>

</body>
</html>