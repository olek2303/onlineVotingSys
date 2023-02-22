package servlets;

import db.database;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "result", value = "/result")
public class Result extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String mail = (String )request.getAttribute("mail");
        int checkBox = Integer.parseInt(request.getParameter("check"));
        database.giveVote(mail, checkBox);
        System.out.println("WYKONANE");
        out.println("Thanks for giving the vote");
        out.println("You " + mail + " gave vote on " + checkBox + " option");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
