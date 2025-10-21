/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

/**
 *
 * @author Mendrika
 */
public class Ecole {
    private int id;
    private String nom;
    private String region;

    public Ecole(int id, String nom, String region) {
        this.id = id;
        this.nom = nom;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getRegion() {
        return region;
    }
    
}
