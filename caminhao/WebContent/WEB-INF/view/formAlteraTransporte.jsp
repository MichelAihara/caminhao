<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formNovaTransporte.jsp</title>
</head>
<body>

	
	
	<form action="${linkEntradaServlet }" method="post">
		
		Local: <input type="text" name="nome" value="${empresa.nome }" />
		Data da Entrega: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
		 
		<input type="hidden" name="id" value="${empresa.id }" />
		<input type="hidden" name="acao" value="AlteraTransporte" />
		
		<input type="submit"/>
		
	</form>

</body>
</html>