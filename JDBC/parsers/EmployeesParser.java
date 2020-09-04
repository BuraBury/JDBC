package JDBC.parsers;

import JDBC.entities.Employees;

public class EmployeesParser implements IParser<Employees> {

    public EmployeesParser() {
    }

    @Override
    public String selectAll() {
        return "SELECT * FROM Employees;";
    }

    @Override
    public String insert(Employees toInsert) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO Employees(first_name, last_name, age) VALUES(")
                .append("\"").append(toInsert.getFirst_name()).append("\",")
                .append("\"").append(toInsert.getLast_name()).append("\",")
                .append(toInsert.getAge()).append(");");
        return sb.toString();
    }

    @Override
    public String update(Employees toUpdate) {
        return String.format("UPDATE Employees SET first_name=\"%s\", last_name=\"%s\", age=%d WHERE id=%d;",
                toUpdate.getFirst_name(), toUpdate.getLast_name(),
                toUpdate.getAge(), toUpdate.getID());
    }

    @Override
    public String delete(Employees toDelete) {
        return "DELETE FROM Employees WHERE id=" + toDelete.getID() + ";";
    }
}
