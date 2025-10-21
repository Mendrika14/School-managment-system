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
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private String option;
    private int note_math;
    private int note_frs;
    private int note_ang;
    private int note_pc;

    public Etudiant(int id, String nom, String prenom, String sexe, String option, int note_math, int note_frs, int note_ang, int note_pc) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.option = option;
        this.note_math = note_math;
        this.note_frs = note_frs;
        this.note_ang = note_ang;
        this.note_pc = note_pc;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getOption() {
        return option;
    }

    public int getNote_math() {
        return note_math;
    }

    public int getNote_frs() {
        return note_frs;
    }

    public int getNote_ang() {
        return note_ang;
    }

    public int getNote_pc() {
        return note_pc;
    }
    
    
    
}
