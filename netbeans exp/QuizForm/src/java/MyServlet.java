
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
            
            String name = request.getParameter("name");
            String pwd = request.getParameter("pwd");
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");
            String course = request.getParameter("course");
            

                out.println("<h1>Name:"+name+"<br>");
                out.println("<h1>Password:"+pwd+"<br>");
                out.println("<h1>Email:"+email+"<br>");
                out.println("<h1>Gender:"+gender+"<br>");
                out.println("<h1>course:"+course+"<br>");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
