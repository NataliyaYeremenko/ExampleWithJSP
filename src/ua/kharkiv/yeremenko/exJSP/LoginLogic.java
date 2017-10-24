package ua.kharkiv.yeremenko.exJSP;
import java.sql.*;

public class LoginLogic {
    public boolean checkLogin(String login, String password) {
        try {
            String url = "jdbc:mysql://localhost:3306/epam_schema2";
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = null;
            try {
                cn = DriverManager.getConnection(url, "root", "root");
                PreparedStatement st = null;
                try {
                    st = cn.prepareStatement(
                            "SELECT * FROM USERS WHERE LOGIN = ? AND PASSWORD = ?");
                    st.setString(1, login);
                    st.setString(2, password);
                    System.out.println(st);
                    ResultSet rs = null;
                    try {
                        rs = st.executeQuery();
                        return rs.next();
                    } finally {
                        if (rs != null) rs.close();
                    }
                } finally {
                    if (st != null) st.close();
                }
            } finally {
                if (cn != null) cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
