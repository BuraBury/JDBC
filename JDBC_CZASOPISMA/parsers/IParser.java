package JDBC_CZASOPISMA.parsers;

public interface IParser<T> {

    String selectAll();

    String insert(T toInsert);

    String update(T toUpdate);

    String delete(T toDelete);
}
