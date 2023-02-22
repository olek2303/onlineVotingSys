package servlets;

import db.database;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //podaje email i haslo dalej do voting jsp
        final String DB_URL = "jdbc:mysql://localhost:3306/voting";
        final String USER = "root";
        final String PASS = "root";
        PrintWriter out = response.getWriter();
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        //out.println(mail+" "+password);
        database.registerUser(mail,password);
        getServletContext().getRequestDispatcher("/voting.jsp").forward(request, response);
    }
}
