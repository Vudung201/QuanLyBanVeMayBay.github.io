/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoiSQL;

/**
 *
 * @author ASUS
 */

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.logging.Level;

import java.util.logging.Logger;
public class ketnoiSQL {
      public static Connection getConnection() {

        String url = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        final String dbUrl = "jdbc:sqlserver://LAPTOP-HU4V9EL6:1433;databaseName=quanlyBanVeMB";
        String user = "sa";
        String pass = "1234";
        try {

            Class.forName(url);
            return DriverManager.getConnection(dbUrl,user,pass);

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(ketnoiSQL.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

            Logger.getLogger(ketnoiSQL.class.getName()).log(Level.SEVERE, null, ex);

        }
        return null;
    }


    public void Close() throws Exception {
        Connection con = getConnection();
        con.close();

    }
}
