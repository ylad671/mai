import java.io.IOException;
import java.io.PrintWriter;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/avg")
public class AvgNum extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
        int sum = (int) req.getAttribute("sum");
  
        float avg = (float) (sum / 2.0);
          
        PrintWriter out = resp.getWriter();
        out.println("Sum is: " + sum);
        out.println("Average is: " + avg);
  
    }
  
}