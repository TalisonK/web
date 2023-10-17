<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Criação de Empresa</title>
</head>
<body>
		<h2>Cadastro de Empresa </h2>
		<form action="${linkServletNovaEmpresa}" method="post">
			Nome: <input type="text" name="nome" />
			<br>
			CNPJ: <input type="text" name="cnpj" />
			<br>
			Data de Abertura: <input type="text" name="data" />
			<br>
			<input type="submit" value="cadastrar" />
		</form>

</body>
</html>