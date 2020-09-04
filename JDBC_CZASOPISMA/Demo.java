package JDBC_CZASOPISMA;

import JDBC_CZASOPISMA.DAO.MagasinesDAO;
import JDBC_CZASOPISMA.entities.Magasines;
import JDBC_CZASOPISMA.parsers.MagasinesParser;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        MagasinesDAO dao = new MagasinesDAO();
        MagasinesParser mp = new MagasinesParser();

        Magasines mgz = new Magasines(1, "AAA", "BBB", 4, 5, "CCC");
        Magasines mgz1 = new Magasines(1, "dupcia", "BBB", 4, 5, "CCC");
        Magasines twoje_imperium = new Magasines(24, "twoje imperium", "dwutygodnik", 2, 3, "tak");


        /*dao.delete(twoje_imperium);
        dao.insertMagasine(mgz);
        dao.insertMagasine(mgz1);
        dao.insertMagasine(new Magasines(1, "Bravo", "Miesiecznik", 5, 6, "tak"));
        dao.delete(new Magasines(28, "Bravo", "Miesiecznik", 5, 6, "Tak"));*/


        List<Magasines> result = dao.getAllMagasines();
        result.forEach(System.out::println);


    }
}
