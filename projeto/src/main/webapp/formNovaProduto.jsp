<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Produto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovaProduto" var="linkServletNovaProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Criação de Produto</title>
</head>
<body>
		<h2>Cadastro de Produto </h2>
		<form action="${linkServletNovaProduto}" method="post">
			Nome: <input type="text" name="nome" />
			<br>
			preço: <input type="text" name="preco" />
			<br>
			Validade: <input type="text" name="validade" />
			<br>
			<input type="submit" value="cadastrar" />
		</form>

</body>
</html>