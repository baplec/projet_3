package org.example;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        dbconnect test = new dbconnect();
        test.dbconnect();

        Frame test_2 = new Frame();
        test_2.show();






    }

}