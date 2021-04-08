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
@WebServlet("/transfer-amount")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final AccountBean ac = new AccountBean();
	private final AccountBean ac2 = new AccountBean();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferServlet() {
        super();
        ac.setBalance(0);
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();
	    
		String account_type = request.getParameter("account_type");
		String account_id = request.getParameter("account_id");
		String amount = request.getParameter("amount");
		
		if(account_type.isEmpty()) {
			out.print("Please selet account");  
	        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
	        rd.include(request,response); 
		} else if(amount.isEmpty()) {
			out.print("Please enter amount");  
	        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
	        rd.include(request,response);
		} else if(account_id.isEmpty()) {
			out.print("Please enter account id");  
	        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
	        rd.include(request,response); 
		} else {
			ac.withdraw(Integer.parseInt(amount));
			ac2.deposit(Integer.parseInt(amount));
			// functioanlity to add account details to db
			// [Pending] - getting some issue on connection 
			
			out.print("Amount Transfered");  
	        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
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

