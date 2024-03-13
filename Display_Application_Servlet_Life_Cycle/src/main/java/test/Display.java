package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/dis")
public class Display extends HttpServlet{
    public int x;
    public int y;
    public Display(){
    	x++;
    	y++;
    }
    public void init()throws ServletException{
    	x++;
    	y++;
   }
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
    	PrintWriter pw=res.getWriter();
    	res.setContentType("html/text");
    	String uName=req.getParameter("uname");
    	pw.println("Welcome User:"+uName+"<br>");
    	pw.println("The value of x:"+x+"<br>");
    	pw.println("The value of y:"+y+"<br>");
    }
    public void destroy(){
    	x=200;
    	y=500;
    }
}
