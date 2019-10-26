<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ page import="java.util.List,br.com.carbone.caminhao.modelo.Transporte"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listaEmpresas.jsp</title>
</head>

<body>
	
	<c:if test="${not empty empresa}">
	
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>


	ENTREGA POR DISTRIBUIDORA: <br />
	
	<ul>
		<c:forEach items="${empresas}"  var="empresa">
		
			<li> 
				Local: ${empresa.nome} - 
				Data: <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				
				
				  <a href="/caminhao/entrada?acao=MostraTransporte&id=${empresa.id }">edita</a> 
				  <a href="/caminhao/entrada?acao=RemoveTransporte&id=${empresa.id }">remove</a>
			</li>
		</c:forEach>	
	</ul>
	
	<a href="/caminhao/entrada?acao=NovaTransporteForm">Cadastrar Novo Transporte</a>
	
</body>
</html>