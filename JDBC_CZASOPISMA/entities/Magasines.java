package JDBC_CZASOPISMA.entities;

public class Magasines {
    private int ISSN;
    private String title;
    private String type;
    private int id_red;
    private int id_second_red;
    private String colored;

    public Magasines(int ISSN, String title, String type, int id_red, int id_second_red, String colored) {
        this.ISSN = ISSN;
        this.title = title;
        this.type = type;
        this.id_red = id_red;
        this.id_second_red = id_second_red;
        this.colored = colored;
    }

    public int getISSN() { return ISSN; }

    public void setISSN(int ISSN) { this.ISSN = ISSN; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public int getId_red() { return id_red; }

    public void setId_red(int id_red) { this.id_red = id_red; }

    public int getId_second_red() { return id_second_red; }

    public void setId_second_red(int id_second_red) { this.id_second_red = id_second_red; }

    public String getColored() { return colored; }

    public void setColored(String colored) { this.colored = colored; }

    @Override
    public String toString() {
        return "Magasines{" +
                "ISSN=" + ISSN +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", id_red=" + id_red +
                ", id_second_red=" + id_second_red +
                ", colored='" + colored + '\'' +
                '}';
    }
}
