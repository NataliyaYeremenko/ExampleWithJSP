package ua.kharkiv.yeremenko.exJSP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RoleLogic{
    public String getRole(String login) {
        String role_name = null;
        try {
            String url = "jdbc:mysql://localhost:3306/epam_schema2";
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = null;
            try {
                cn = DriverManager.getConnection(url, "root", "root");
                PreparedStatement st = null;
                try {
                    st = cn.prepareStatement("SELECT * FROM ROLES WHERE ROLE_ID IN (" +
                            "SELECT ROLE_ID FROM USERS WHERE LOGIN = ?)");
                    st.setString(1, login);
                    System.out.println(st);
                    ResultSet rs = null;
                    try {
                        rs = st.executeQuery();
                        while (rs.next()) {
                            role_name = rs.getString("name");
                            System.out.println(role_name);
                        }
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
        }
        return role_name;
    }
}
