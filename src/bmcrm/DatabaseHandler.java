package bmcrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connetionString = "jdbc:mysql//" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connetionString, dbUser, dbPass);

        return dbConnection;
    }

    // Запись и чтение базы данных





}
