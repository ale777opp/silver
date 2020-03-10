package test1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class testservl extends HttpServlet {
    int i2=0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

     //writer.println(" hello hello");
        PrintWriter out=writer;
        int i=0;
        out.println("<html>");
        out.println("<h1>Hello</h1>");
        out.println("Goodbye " + i++);
        out.println("Goodbye " + i2++);
        out.println("<a href='test1'>test1</a>");
        out.println("</html>");
        writer.close();
    }
}
