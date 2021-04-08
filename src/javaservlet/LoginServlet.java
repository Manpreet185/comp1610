package javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankAccountServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n = request.getParameter("username");  
	    String p = request.getParameter("userpass");  
	          
	    if(n.equals("ha07") && p.equals("ha07")){  
	        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Invalid username or password");  
	        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
