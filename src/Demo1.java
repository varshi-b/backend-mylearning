import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; // Used instead of Statement
import java.sql.ResultSet;
import java.sql.SQLException; // Recommended for specific exception handling

public class Demo1 {

    public static void main(String[] args) {
        // 1. Connection Details
        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = 

        // Use a parameterized SQL query with a placeholder (?)
        String sql = "SELECT name FROM person WHERE id = ?";

        String name = null;

        // 2. Use try-with-resources for automatic resource closing
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // 3. Set the parameter value
            int personId = 2; // The ID you want to retrieve
            ps.setInt(1, personId); // Set the first placeholder (?) to the value 2

            // 4. Execute the query
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    name = rs.getString("name"); // Use column name for better readability
                    System.out.println("Retrieved Name: " + name);
                } else {
                    System.out.println("No person found with ID: " + personId);
                }
            }

        } catch (SQLException e) {
            // 5. Handle specific SQL errors
            System.err.println("Database Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        // No 'finally' block needed, as try-with-resources handles closing resources automatically.
    }
}
