/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Immortel
 */
public class Connexion {

    static {
        getInstance();
    }

    private static Connection con;
    private String user = "sa", pass = "bb", 
            url = "jdbc:sqlserver://BIENFAIT\\SA:1433;databaseName=MonTfc";

    private Connexion() {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {

        }
    }

    public static Connection getInstance() {
        if (con == null) {
            new Connexion();
          //  System.out.println("cool");
        }
        return con;
    }
}
