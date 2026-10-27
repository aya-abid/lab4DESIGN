package problem1after;

public interface DatabaseFactory {
    DbConnection createConnection();
    SqlDialect createDialect();

    static DatabaseFactory forName(String name) {
        switch (name.toLowerCase()) {
            case "mysql":
                return new MySqlFactory();
            case "sqlserver":
                return new SqlServerFactory();
            case "oracle":
                return new OracleFactory();
            default:
                throw new IllegalArgumentException("Unknown database: " + name);
        }
    }
}