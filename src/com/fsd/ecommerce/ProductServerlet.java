package com.fsd.ecommerce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/ProductServerlet")
public class ProductServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("name");
		String productPrice = request.getParameter("price");
		
		Product product = new Product(request.getSession());
		product.setName(productName);
		product.setPrice(productPrice);
		response.sendRedirect("productdetails.jsp");


	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.sendRedirect("product.html");
    }
	
	

}
