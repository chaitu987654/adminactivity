

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet  
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
 
		String name=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
 
		if(name.equals("admin")&&pass.equals("admin")) 
		{
			RequestDispatcher rs = req.getRequestDispatcher("AdminManagement");
            rs.forward(req, res);
		}
        else
	    {
        	 pw.println("Username or Password incorrect");
             RequestDispatcher rs = req.getRequestDispatcher("index.html");
             rs.include(req, res);
         }                
	                
		 //pw.close();
 
	}
 
}