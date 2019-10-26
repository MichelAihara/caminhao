<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formNovaEmpresa.jsp</title>
</head>
<body>

	
	
	
	<form action="${linkEntradaServlet}" method="post">
	
				Local: <input type="text" required name="nome" />
				Data de Entrega: <input type="text" required name="data" placeholder="dd/MM/yyyy"/>
				<input type="hidden" name="acao" value="NovaTransporte" />
				<input type="submit" />
		
		
		<p><a href="/caminhao/entrada?acao=ListaTransportes"> Entrega por Distribuidora</a></p>
		
	</form>

</body>
</html>