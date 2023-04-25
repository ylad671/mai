
import java.io.IOException;
  
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/add")
public class AddNum extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
      
        int num1 = Integer.parseInt(req.getParameter("x"));
        int num2 = Integer.parseInt(req.getParameter("y"));
  
        
        int add = num1 + num2;
          
        
        req.setAttribute("sum", add);
  
       
        RequestDispatcher reqd = req.getRequestDispatcher("avg");
        
        reqd.forward(req, resp);
    }
  
}