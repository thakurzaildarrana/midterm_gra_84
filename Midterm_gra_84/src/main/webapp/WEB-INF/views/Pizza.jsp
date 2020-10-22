<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pizza Orders - Gurav Singh Rana 300304884</title>
<link href="<c:url value="/static/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/static/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">

		<hr />
		<c:if test="${ message != null }">
			<div class="alert alert-success" role="alert">${message}</div>
		</c:if>
		<table class="table table-striped table-bordered">

			<tr>

				<td>Id</td>
				<td>size</td>
				<td>Firstname</td>
				<td>Lastname</td>
				<td>numberOfToppings</td>
				<td>discount</td>
				<td>price</td>


			</tr>
			<c:forEach var="Pizza" items="${Pizza}">
				<tr>
					<td>${Pizza.id}</td>
					<td>${Pizza.firstname}</td>
					<td>${Pizza.lastname}</td>
					<td>${Pizza.size}</td>
					<td>${Pizza.numberOfToppings}</td>
					<td>${Pizza.discount}</td>
					


				</tr>
			</c:forEach>

		</table>
		<h3>Create Order</h3>
		<form:form action="${pageContext.request.contextPath}/createPizza/"
			cssClass="form-horizontal" method="post" modelAttribute="Pizza">
			<label for="firstname">First name:</label> <input type="text" id="firstname"
				name="firstname"><br><br>
				
				<label for="lastname">Last name:</label> 
				<input type="text" id="lastname" name="lastname"><br><br>
			
			<label for="size">size:</label> 
				<input type="size" id="size" name="size"><br><br>
				

			
				<label for="numberOfToppings">numberOfToppings:</label> 
				<input type="number" id="numberOfToppings" name="numberOfToppings"><br><br>
			
				 <label for="discount">discount :</label> 
				<input type="number" id="discount" name="discount"><br><br>
				
			 <input type="submit" value="Submit">
	</form:form>
	
			
		

		
	</div>

</body>
</html>