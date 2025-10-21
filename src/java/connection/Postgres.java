/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mendrika
 */
public class Postgres {
    private Connection con;
    public Postgres()throws Exception{
         Class.forName("org.postgresql.Driver");
         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projet","postgres", "sylvestre");
    }

    public Connection getCon() {
        return con;
    }
}
