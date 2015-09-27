package name.eipi.kiss.webservice;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by Damien on 03/06/2015.
 */
@WebServlet("/context")
public class ContextServlet extends HttpServlet {

    private int INSTANCE = 1;
    private static int STATIC = 1;

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        int METHOD = 1;
        try {
            PrintWriter pw = response.getWriter();
            pw.print("STATIC=" + STATIC);
            pw.print("INSTANCE=" + INSTANCE);
            pw.print("METHOD=" + METHOD);
            INSTANCE++;
            STATIC++;
            METHOD++;

//            String message = "Hello World";
//            request.setAttribute("message", message); // This will be available as ${message}
//            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

            pw.close();

        } catch(Throwable t) {

        }

    }


}