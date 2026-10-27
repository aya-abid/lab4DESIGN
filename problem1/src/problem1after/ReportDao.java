package problem1after;

public class ReportDao {
    private final DbConnection connection;
    private final SqlDialect dialect;

    public ReportDao(DatabaseFactory factory) {
        this.connection = factory.createConnection();
        this.dialect = factory.createDialect();
    }

    public void topStudents(int n) {
        System.out.println(connection.connect());
        System.out.println(dialect.selectTop("students", n));
    }
}
