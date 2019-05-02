/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolcarsproject;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author koryo
 */
public class SQLConnection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3307/coolcars";

    public ResultSet q(String s){
         ResultSet result = null;

         try {
             Statement stmt = conn.createStatement();
             result = stmt.executeQuery(s);
         }
         catch (Exception e){System.out.println(e);}

        return result;
    }

    private ResultSet result;


    Connection conn = null;
    Scanner in = new Scanner(System.in);

    public SQLConnection(){
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
            Statement stmt = (Statement) conn.createStatement();
           
        } catch (SQLException e){
            System.err.println(e);
        }
    //public static void main(String[] args) {
        
    }
}
    
