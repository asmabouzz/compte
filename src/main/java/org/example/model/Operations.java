package org.example.model;

public class Operations {

    private int numero;
    private double montant;

    private Statut statut;


    public Operations(int numero, double montant, Statut statut) {
        this.numero = numero;
        this.montant = montant;
        this.statut = statut;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "numero=" + numero +
                ", montant=" + montant +
                ", statut=" + statut +
                '}';
    }
}
