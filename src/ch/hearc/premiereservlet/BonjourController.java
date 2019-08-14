package ch.hearc.premiereservlet;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Bonjour")
public class BonjourController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BonjourController() {
		super();
	}
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nom = req.getParameter("nom");
		
		resp.getWriter()
		.append("<h1>")
		.append("Bonjour ")
		.append(nom)
		.append("</h1>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
String nom = req.getParameter("nom");
		
		resp.getWriter()
		.append("<h1>")
		.append("Bonjour ")
		.append(nom)
		.append(" , POST </h1>");
	}

	
}
