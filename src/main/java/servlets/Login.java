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

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        //out.println(mail+" "+password);
        database.registerUser(mail,password);
        System.out.println("POST IN LOGIN: " + mail + " " + password);
        System.out.println("WYKONANE");
        getServletContext().getRequestDispatcher("/voting.jsp").forward(request, response);
    }
}
