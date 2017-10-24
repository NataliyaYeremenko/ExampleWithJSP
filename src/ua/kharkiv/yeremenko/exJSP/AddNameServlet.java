package ua.kharkiv.yeremenko.exJSP;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AddNameServlet")
public class AddNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        HttpSession session = request.getSession();
        List<String> list = (List)session.getAttribute("list");
        if (list == null){
            list = new ArrayList<>();
            session.setAttribute("list", list);
        }
        list.add(login);
        response.sendRedirect("task3.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        HttpSession session = request.getSession();
        List<String> list = (List)session.getAttribute("list");
        if (list == null){
            list = new ArrayList<>();
            session.setAttribute("list", list);
        }
        list.add(login);
        request.getRequestDispatcher("task3.jsp").forward(request, response);
    }
}
