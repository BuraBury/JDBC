package JDBC.DAO;

import JDBC.entities.Employees;
import JDBC.parsers.EmployeesParser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAO extends BaseDAO<Employees> {

    private EmployeesParser parser = new EmployeesParser();

    public void insertEmployee(Employees employees) {
        String sql = parser.insert(employees);
        execute(sql);
    }

    public void updateEmployee(Employees employees) {
        String sql = parser.update(employees);
        execute(sql);
    }

    public void delete(Employees employees) {
        String sql = parser.delete(employees);
        execute(sql);
    }

    public List<Employees> getAllEmployees() {
        String sql = parser.selectAll();
        return executeSelect(sql);
    }


    @Override
    public List<Employees> getParsedData(ResultSet rs) {
        List<Employees> result = new ArrayList<>();
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                int age = rs.getInt("age");

                result.add(new Employees(id, first_name, last_name, age));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
