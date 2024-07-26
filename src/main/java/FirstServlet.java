import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // Set content type of the response
        PrintWriter pw = response.getWriter(); // Get the PrintWriter object to write the response
        
        String eno = request.getParameter("eno");
        String ename = request.getParameter("ename");
        String salary = request.getParameter("salary");
        
        pw.println("<html><body>"); // Start HTML body
        pw.println("<h2>Employee Details</h2>");
        pw.println("<table border>");
        pw.println("<tr><th>Emp no</th><td>"+eno+"</td></tr>");
        pw.println("<tr><th>Emp name</th><td>"+ename+"</td></tr>");
        pw.println("<tr><th>Emp salary</th><td>"+salary+"</td></tr>");
        pw.println("</table>");
        pw.println("</body></html>"); // End HTML body
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response); // Call doGet() method for POST requests
    }
}
