<%@page import="com.fsd.ecommerce.Product"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Product details</title>
</head>
<body>
<%
//allow access only if session exists

Product product = new Product(session);


%>
<h3>Product Details</h3>

<p>
Product Name:<%=product.getName() %> <br>
Product Price:<%=product.getPrice() %> <br>
</p>
<a href="./">Go Back</a>


</body>
</html>