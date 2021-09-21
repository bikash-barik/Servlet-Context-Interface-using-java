import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class DemoServlet1 extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    ServletConfig config=getServletConfig();
    ServletContext context=getServletContext();  
    String Student=config.getInitParameter("sname");
    String clgname=context.getInitParameter("clgname"); 
    out.print("<body  style='background-color: #55a15e; color: #000000; '><center style='margin-top: 120px;'><h1>Student Name is: "+"<b style='color: #ffffff;'>"+Student+"</b>"+"<br/>"+"University Name is: "+clgname);
    out.println("<br/><a href='context' color='black'>Next Student</a></center></h1></body>");  
          
    out.close();  
    }  
  
}  
