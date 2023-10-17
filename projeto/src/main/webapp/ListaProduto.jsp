<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.ifpb.gerenciador.Produto" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Produtos</title>
</head>
<body>	
	<c:if test="${not empty Produto}">		
	        <p>Produto ${nomeProduto} Criado com sucesso!</p>	   
    </c:if>	
	
	<p>Lista de Produtos</p>
	
	<ul>
		<c:forEach items="${listaProdutos}" var="Produto">		
			<li>${Produto.id} - ${Produto.nome} 
			- <fmt:formatDate value="${Produto.validade}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostraProduto?id=${Produto.id}">editar</a>
				<a href="/gerenciador/removeProduto?id=${Produto.id}">remover</a>
			</li>
		</c:forEach>		
	</ul>
	
	<a href="/gerenciador/formNovaProduto.jsp">Criar Novo Produto</a>
</body>
</html>