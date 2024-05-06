package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }


    public void connect(String url){

        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Polaczono");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
