package JDBC_CZASOPISMA.DAO;

import JDBC_CZASOPISMA.entities.Magasines;
import JDBC_CZASOPISMA.parsers.MagasinesParser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MagasinesDAO extends BaseDAO<Magasines> {

    private MagasinesParser parser = new MagasinesParser();

    public void insertMagasine(Magasines magasine) {
        String sql = parser.insert(magasine);
        execute(sql);
    }

    public void updateMagasines(Magasines magasine) {
        String sql = parser.update(magasine);
        execute(sql);
    }

    public void delete(Magasines magasine) {
        String sql = parser.delete(magasine);
        execute(sql);
    }

    public List<Magasines> getAllMagasines() {
        String sql = parser.selectAll();
        return executeSelect(sql);
    }

    @Override
    public List<Magasines> getParsedData(ResultSet rs) {
        List<Magasines> result = new ArrayList<>();
        try {
            while (rs.next()) {
                int ISSN = rs.getInt("ISSN");
                String title = rs.getString("title");
                String type = rs.getString("type");
                int id_red = rs.getInt("id_red");
                int id_second_red = rs.getInt("id_second_red");
                String colored = rs.getString("colored");


                result.add(new Magasines(ISSN, title, type, id_red, id_second_red, colored));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
