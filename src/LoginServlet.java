import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@javax.servlet.annotation.WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName = request.getParameter("usename");
        String passWord = request.getParameter("password");

        PrintWriter writer = response.getWriter();
//        writer.println("<html>");

        if ("admin".equals(userName)&&"admin".equals(passWord)){
            writer.println("<h1>Wellcome" + userName + "</h1>");
        }
        else {
            writer.println("<h1>Dai mat khau hoac ten tai khoan</h1>");
        }
//        writer.println("<html>");
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName = request.getParameter("usename");
        String passWord = request.getParameter("password");

        PrintWriter writer = response.getWriter();
//        writer.println("<html>");

        if ("admin".equals(userName)&&"admin".equals(passWord)){
            writer.println("<h1>Wellcome" + userName + "</h1>");
        }
        else {
            writer.println("<h1>Dai mat khau hoac ten tai khoan</h1>");
        }
//        writer.println("<html>");
    }
}
