/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import connection.Postgres;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author Mendrika
 */
public class Inscription {
    public static void inscrir(String nom,String prenom,String sexe,String ecole,String options,String note_ang,String note_frs,String note_math,String note_pc)throws Exception{
        Connection con= new Postgres().getCon();
        Statement stmt=con.createStatement();
        String don="insert into Etudiant(nom,prenom,sexe,id_ecole,options,note_ang,note_frs,note_math,note_pc) values('"+nom+"','"+prenom+"','"+sexe+"',"+ecole+",'"+options+"',"+note_ang+","+note_frs+","+note_math+","+note_pc+")";
            System.out.println("iizefjozief ojifjze     "+don);
        stmt.executeUpdate(don);
        stmt.close();
    }
    public static Vector<Ecole> get_ecole()throws Exception{
        String vop="";
        String sql="select * from Ecole";
        Connection con= new Postgres().getCon();
        Statement stmt=con.createStatement();
        ResultSet fin=stmt.executeQuery(sql);
        int D1=fin.getRow();
        ResultSetMetaData rsmd = fin.getMetaData();
        int D2 = rsmd.getColumnCount();
        Vector<Ecole> storage=new Vector<Ecole>();
        int isa=0;
        while(fin.next()){
            storage.add(new Ecole(fin.getInt(1),fin.getString(2),fin.getString(3)));
        }
        fin.close();
        stmt.close();
        return storage; 
    }
    public static Vector<Etudiant> get_etudiant_inscrit()throws Exception{
        String vop="";
        String sql="select * from Etudiant";
        Connection con= new Postgres().getCon();
        Statement stmt=con.createStatement();
        ResultSet fin=stmt.executeQuery(sql);
        int D1=fin.getRow();
        ResultSetMetaData rsmd = fin.getMetaData();
        int D2 = rsmd.getColumnCount();
        Vector<Etudiant> storage=new Vector<Etudiant>();

        while(fin.next()){
            storage.add(new Etudiant(fin.getInt(1),fin.getString(2),fin.getString(3),fin.getString(4),fin.getString(5),fin.getInt(7),fin.getInt(8),fin.getInt(9),fin.getInt(10)));
        }
        fin.close();
        stmt.close();
        return storage; 
    }
}
