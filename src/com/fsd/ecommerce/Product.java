package com.fsd.ecommerce;
import javax.servlet.http.HttpSession;

public class Product {

	private HttpSession httpSession;

	public Product(HttpSession httpSession) {
		this.httpSession = httpSession;
		this.httpSession.setMaxInactiveInterval(30*60);
	}

	public void setName(String name) {
//		this.productName = name;
		this.httpSession.setAttribute("name", name);
	}

	
	public String getName() {
		return (String) this.httpSession.getAttribute("name");
	}

	
	public void setPrice(String price) {
		this.httpSession.setAttribute("price", price);
	}

	
	public String getPrice() {
		return (String) this.httpSession.getAttribute("price");
	}

}
