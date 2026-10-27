package problem1after;

public class Test {
    public static void main(String[] args) {
        DatabaseFactory mysqlFactory = DatabaseFactory.forName("mysql");
        ReportDao mysqlDao = new ReportDao(mysqlFactory);
        mysqlDao.topStudents(3);

        DatabaseFactory sqlServerFactory = DatabaseFactory.forName("sqlserver");
        ReportDao sqlServerDao = new ReportDao(sqlServerFactory);
        sqlServerDao.topStudents(3);

        DatabaseFactory oracleFactory = DatabaseFactory.forName("oracle");
        ReportDao oracleDao = new ReportDao(oracleFactory);
        oracleDao.topStudents(3);
    }
}