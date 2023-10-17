<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Produto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraProduto" var="linkServletAlteraProduto"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Criação de Produto</title>
</head>
<body>
		<h2>Cadastro de Produto </h2>
		<form action="${linkServletAlteraProduto}" method="post">
			<input type="hidden" name="id" value="${Produto.id}"/>
			Nome: <input type="text" name="nome" value="${Produto.nome}"/>
			<br>
			CNPJ: <input type="text" name="preco" value="${Produto.preco}" />
			<br>
			Validade: <input type="text" name="validade" 
				value="<fmt:formatDate 
					value="${Produto.validade}" 
					pattern="dd/MM/yyyy"/>" />
			<br>
			<input type="submit" value="Atualizar" />
		</form>

</body>
</html>