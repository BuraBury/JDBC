package JDBC.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDAO<T> {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/EMP?serverTimezone=EST";

    static final String USER = "root";
    static final String PASS = "***";

    private Connection conn;
    private Statement stmt;

    public abstract List<T> getParsedData(ResultSet rs);


    protected void execute(String sql) {
        createConnection();
        try {
            stmt.execute(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("błąd wykonania zapytania: " + sql);
        }
        disconnect();
    }

    protected List<T> executeSelect(String sql) {
        createConnection();
        List<T> result = new ArrayList<>();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            result = getParsedData(rs);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("błąd wykonania zapytania: " + sql);
        }
        disconnect();
        return result;
    }


    private void createConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void disconnect() {
        try {
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

}
