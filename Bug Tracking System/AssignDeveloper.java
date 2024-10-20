import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/assigndeveloper")
public class AssignDeveloper extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String projectid = request.getParameter("projectid");
        String severity = request.getParameter("severity");
        String empname = request.getParameter("employeename");
        String bugdetail = request.getParameter("bugdetail");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bug", "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO assigndeveloper (projectid, severity, employename, bugdetail) VALUES (?, ?, ?, ?)");
            ps.setString(1, projectid);
            ps.setString(2, severity);
            ps.setString(3, empname);
            ps.setString(4, bugdetail);

            ps.executeUpdate();
            response.sendRedirect("Successad.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("Error.jsp");
        }
    }
}
