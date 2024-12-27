import java.servlet.*:
import java.servlet.http.*;
import java.io.*;

public class ServletPractice{
    public void doPost(HttpServletResponse res, HttpServletRequest req)
        throws ServletException, IOException{

        //get parameter from response
        String username = res.getParameter("username");
        String password = res.getParameter("password");

        //set the response content type
        res.setContentType("text/html");

        //get the output stream for writing the response

        PrintWriter out = res.getWriter();
        
        //print the response

        out.println("<html>");
        out.println("<head><title>Form Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Form Servlet </h1>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body>");
        out.println("</html>");

        pw.close();
    }
}
