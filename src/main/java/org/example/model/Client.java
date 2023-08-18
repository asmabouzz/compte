package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id ;
    private String nom;
    private String prenom;
    private String numTel;
    private List<CompteBancaire> comptes;

    public Client(String nom, String prenom, String numTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.comptes =new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public void setComptes(List<CompteBancaire> comptes) {
        this.comptes = comptes;
    }

    public CompteBancaire ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
        return compte;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numTel='" + numTel + '\'' +
                ", comptes=" + comptes +
                '}';
    }
}
