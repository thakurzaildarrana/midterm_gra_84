<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Pizza</title>
<link href="<c:url value="/static/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/static/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
	<div class="container">
	
			<h1>Pizza Menu Gaurav Rana -300304884</h1>

			<hr />
			<c:if test="${ message != null }" >
				<div class="alert alert-success" role="alert">${message}</div>
			 </c:if>			
				<table class="table table-striped table-bordered">
				
					<tr>
						<td>Id</td>
						<td>size</td>
						<td>First Name</td>
						<td>Last Name</td>
						<td>noToppings</td>
						<td>Discount</td>
						<td>Price</td>
					</tr>
					<c:forEach var="pizzas" items="${pizza}">
						<tr>
							<td>${pizzas.id}</td>
							<td>${pizzas.size}</td>
							<td>${pizzas.firstName}</td>
							<td>${pizzas.lastName}</td>
							<td>${pizzas.numberOfToppings}</td>
							<td>${pizzas.discount}%</td>
							<td>$${pizzas.price}</td>
			
						</tr>
					</c:forEach>
          
				</table>
				
				<h2>Create Order</h2>
		
			<form:form action="${pageContext.request.contextPath}/createPizza/" cssClass="form-horizontal"
			method="POST" modelAttribute="pizzas">
			
			
			<div class="form-group">
				<label for="id" class="col-md-3 control-label">id</label>
				<div class="col-md-9">
					<form:input path="id" cssClass="form-control" />
				</div>
			</div>

			<div class="form-group">
				<label for="firstName" class="col-md-3 control-label">First Name</label>
				<div class="col-md-9">
					<form:input path="firstName" cssClass="form-control" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="lastName" class="col-md-3 control-label">Last Name</label>
				<div class="col-md-9">
					<form:input path="lastName" cssClass="form-control" />
				</div>
			</div>
			
			<div class="form-group">
				<label for="size" class="col-md-3 control-label">Size</label>
				<div class="col-md-9">
					<form:select path="size" cssClass="form-control">
					<form:option value="">Select Pizza</form:option>
					<form:options items="${sizes}"/>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label for="discount" class="col-md-3 control-label">discount</label>
				<div class="col-md-9">
					<form:input path="discount" cssClass="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label for="numberOfToppings" class="col-md-3 control-label">Number of Toppings</label>
				<div class="col-md-9">
					<form:input path="numberOfToppings" cssClass="form-control" />
				</div>
			</div>
			
		
			<div class="form-group">
				<!-- Button -->
				<div class="col-md-offset-3 col-md-9">
					<form:button cssClass="btn btn-primary">Submit</form:button>
				</div>
			</div>

		</form:form>
							
	</div>
	

</body>
</html>
