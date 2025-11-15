import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws Exception {
        String sql = "select name from person where id =2";
        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = 
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        conn.close();
    }
}
