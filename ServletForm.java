import java.servlet.*;
import java.servlet.http.*;
import java.io.*;

public class ServletForm extends HttpServlet{
    public void doPost(HttpServletResponse res, HttpSErvletRequest req)
        throws ServletException, IOException{
            
        //Get the request parameter
        String username = res.getParameter("username");
        String password = res.getParameter("password");

        //Set content type text/html
        res.setContentType("text/html");

        //Get the output stream for writing the response

        PrintWriter pw = res.getWriter();
        out.println("<html><head>");
        out.println("<title>ServletForm</title></head>");
        out.println("<body>");
        out.println("<h1>Servlet Form</h1>");
        out.println("<p>Username: " + username + " Password: " + password + "</p>");
        out.println("</body></html>");
        
        pw.close();
    }
}
