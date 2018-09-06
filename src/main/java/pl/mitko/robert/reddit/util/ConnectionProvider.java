package pl.mitko.robert.reddit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reddit", "root", "password");
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}