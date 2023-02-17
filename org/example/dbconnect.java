package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
    public void dbconnect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect;
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/database",
                    "root",
                    "");


        }
        catch (Exception exception) {
            System.out.println(exception);
        }

    }
}
