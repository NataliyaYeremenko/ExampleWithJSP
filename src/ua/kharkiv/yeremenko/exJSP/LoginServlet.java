package ua.kharkiv.yeremenko.exJSP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        super.service(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        performTask(request, response);
    }

    protected void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String cmd = request.getParameter("cmd");
            if ("login".equals(cmd)) {
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                LoginLogic loginLogic = new LoginLogic();
                if (loginLogic.checkLogin(login, password)) {
                    request.setAttribute("user", login);
                    RoleLogic roleLogic = new RoleLogic();
                    request.setAttribute("role", roleLogic.getRole(login));
                    jump("/res.jsp", request, response);
                } else {
                    response.sendRedirect("index.jsp");
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }

    protected void jump(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
}
