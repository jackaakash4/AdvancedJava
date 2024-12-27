import java.servlet.*;
import java.servlet.http.*;
import java.io.*;

public class DemoServlet extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{
        //setting response type as html

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        out.println("<html><body>");
        out.println("Hi, Welcome to servlet");
        out.println("</body></html>");

        pw.close();
    }
}

