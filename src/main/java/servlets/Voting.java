package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "voting", urlPatterns = "/voting")
public class Voting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String checkBox = request.getParameter("check");
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        request.setAttribute("mail", mail);
        request.setAttribute("password", password);
        request.getRequestDispatcher("/result").forward(request, response);
        //getServletContext().getRequestDispatcher("/result").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getServletContext().getRequestDispatcher("/voting.jsp").forward(request, response);


    }
}
