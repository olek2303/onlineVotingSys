package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NewServlet", value = "/newservlet")
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET request in terminal");
        response.setContentType("text/html");
        response.getWriter().println("<p>Here is a line of text</p>");
        response.getWriter().println("<p>And here another one</p>");

        PrintWriter out = response.getWriter();
        String parameter1 = request.getParameter("parameter1");
        String parameter2 = request.getParameter("parameter2");
        String parameter3 = request.getParameter("parameter3");

        if ((parameter1 != null) || (parameter2 != null) || (parameter3 != null)) {
            out.println("To sa wczytane slowa: ");
            out.println(parameter1);
            out.println(parameter2);
            out.println(parameter3);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST request in terminal");
        PrintWriter out = response.getWriter();

        out.println("Wczytanie 3 parametrow z zadania :");
        out.println(request.getParameter("parameter1"));
        out.println(request.getParameter("parameter2"));
        out.println(request.getParameter("parameter3"));
    }
}
