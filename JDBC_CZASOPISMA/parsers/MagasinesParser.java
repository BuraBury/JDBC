package JDBC_CZASOPISMA.parsers;

import JDBC.entities.Employees;
import JDBC_CZASOPISMA.entities.Magasines;

public class MagasinesParser implements IParser<Magasines> {

    public MagasinesParser() {
    }

    @Override
    public String selectAll() {
        return "SELECT * FROM Magazyny;";
    }

//    @Override
//    public String insert(Magasines toInsert) {
//        return String.format("INSERT INTO Magazyny(ISSN, title, type, id_red, id_second_red, colored) VALUES(ISSN=%d, title=\"%s\", type=\"%s\", id_red=%d, id_second_red=%d, colored=\"%s\");",
//               toInsert.getISSN(), toInsert.getTitle(), toInsert.getType(), toInsert.getId_red(), toInsert.getId_second_red(), toInsert.getColored());
//    }

    @Override
    public String insert(Magasines toInsert) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO Magazyny(title, type, id_red, id_second_red, colored) VALUES(")
                .append("\"").append(toInsert.getTitle()).append("\",")
                .append("\"").append(toInsert.getType()).append("\",")
                .append(toInsert.getId_red()).append(",")
                .append(toInsert.getId_second_red()).append(",")
                .append("\"").append(toInsert.getColored()).append("\");");
        return sb.toString();
    }

    @Override
    public String update(Magasines toUpdate) {
        return String.format("UPDATE Magazyny SET title=\"%s\", type=\"%s\", id_red=%d, id_second_red=%d, colored=\"%s\" WHERE ISSN=%d;",
                toUpdate.getTitle(), toUpdate.getType(), toUpdate.getId_red(), toUpdate.getId_second_red(), toUpdate.getColored(), toUpdate.getISSN());
    }

    @Override
    public String delete(Magasines toDelete) {
        return "DELETE FROM Magazyny WHERE ISSN=" + toDelete.getISSN() + ";";
    }
}
