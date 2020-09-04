package JDBC;

import JDBC.DAO.EmployeesDAO;
import JDBC.entities.Employees;
import JDBC.parsers.EmployeesParser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        EmployeesParser ep = new EmployeesParser();
        Employees emp = new Employees(6, "CC", "BBB", 99);

//        System.out.println(ep.selectAll());
//        System.out.println(ep.insert(emp));
//        System.out.println(ep.update(emp));
//        System.out.println(ep.delete(emp));

        EmployeesDAO dao = new EmployeesDAO();
        dao.updateEmployee(emp);
        List<Employees> result = dao.getAllEmployees();
        //dao.delete(emp);
        dao.insertEmployee(emp);

        result.forEach(System.out::println);
    }
}
