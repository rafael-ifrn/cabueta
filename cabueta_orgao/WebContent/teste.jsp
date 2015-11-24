<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<jsp:useBean id="denuncia" class="br.ifrn.tads.cabueta.modelo.Denuncia" />
<jsp:useBean id="denunciaP" class="br.ifrn.tads.cabueta.dao.DenunciaDAO" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Nome ${param.nome}
	
	<table>
		<tr>
			<th>Denúncia</th>
			<th>Descrição</th>
			<th>Data</th>
		</tr>
	<c:forEach var="denuncia" items="${denunciaP.lista}">
		<tr>
			<td>${denuncia.assunto}</td>
			<td>${denuncia.descricao}</td>
		</tr>
	</c:forEach>
	</table>

</body>
</html>