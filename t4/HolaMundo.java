import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaMundo extends HttpServlet {

    /**
     * Manipular las posibles peticiones enviadas por el cliente
     * utilizando el atributo method=get o method=post
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet HolaMundo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet HolaMundo ubicado en: " + request.getContextPath() + "</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
	
    /**
     * Manipular la petición enviada por el cliente 
     * utilizando el atributo method=get
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Manipular la petición enviada por el cliente 
     * utilizando el atributo method=post
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Devuelve una descripción breve del servlet.
     */
    @Override
    public String getServletInfo() {
        return "Servlet HolaMundo";
    }// </editor-fold>

}
