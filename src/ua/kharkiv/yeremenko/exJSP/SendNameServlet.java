package ua.kharkiv.yeremenko.exJSP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nataliya on 13.09.2017.
 */
@WebServlet("/SendNameServlet")
public class SendNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("cmd");
        System.out.println("*****");
        System.out.println(login);
        request.setAttribute("user", login);
        jump("/task4.jsp", request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("cmd");
        System.out.println(login);
        request.setAttribute("user", login);
        response.sendRedirect("task4.jsp");
    }

    protected void jump(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
}
