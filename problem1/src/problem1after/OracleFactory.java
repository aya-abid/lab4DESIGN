package problem1after;

public class OracleFactory implements DatabaseFactory {
    @Override
    public DbConnection createConnection() {
        return new OracleConnection();
    }

    @Override
    public SqlDialect createDialect() {
        return new OracleDialect();
    }
}