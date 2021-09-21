import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class DemoServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");  
PrintWriter pw=res.getWriter();  
  
//creating ServletContext object  
ServletConfig config=getServletConfig();
ServletContext context=getServletContext();  
  
//Getting the value of the initialization parameter and printing it  
String studentName=config.getInitParameter("sname");  
String clgname=context.getInitParameter("clgname");
pw.println("<body  style='background-color: #6f8f73; color: #000000;'><center style='margin-top: 120px;'><h1>Student name is: "+"<b style='color: #ffffff;'>"+studentName+"</b>"+"<br/>"+ "University Name is :"+clgname);  
pw.println("<br/><a href='context1' color='black'>Next Student</a></h1> </center></body>");  
  
pw.close();  
  
}}