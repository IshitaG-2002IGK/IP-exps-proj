
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int empId=Integer.parseInt(request.getParameter("empId"));
        String empName=request.getParameter("empName");
        String pwd=request.getParameter("pwd");

        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");

                out.println("<h1>Emp Id:"+empId+"<br>");
                out.println("<h1>Emp name:"+empName+"<br>");
                out.println("<h1>Emp salary:"+pwd+"<br>");
        
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
