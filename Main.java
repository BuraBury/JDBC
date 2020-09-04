import java.sql.*;

public class Main {
    // Nazwa sterownika JDBC i ścieżka do bazy
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/EMP?serverTimezone=EST";

    // Dane logowania do danych
    static final String USER = "root";
    static final String PASS = "***";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //Rejestrowanie sterownika JDBC
            Class.forName(JDBC_DRIVER);

            //Otwieranie połączenia
            System.out.println("Connecting to database... ");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //Wykonanie zapytania
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sgl = "SELECT * FROM Employees;";
            ResultSet rs = stmt.executeQuery(sgl); // ResultSet działa jak iterator

            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                int age = rs.getInt("age");

                String result = "Employees[id = " + id + "; " +
                        "first name = " + first_name + "; " +
                        "last name = " + last_name + "; " +
                        "age = " + age + "]";
                System.out.println(result);
            }

            // Zamykanie połączenia - VERY IMPORTANT BO INACZEJ ZAWIESIMY KOMPA
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } finally {
            // douplecheck na zamknięcie
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }


        }
    }
}

