package org.cphbusiness.database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnector {
    // TODO: Consider postgreSQL for practice
    private static final String URL = "jdbc:sqlite:database.sqlite";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}