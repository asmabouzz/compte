package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {



    private int id;
    private double solde;
    private Client client;
    private List<Operations> operations ;


    public CompteBancaire(double solde, Client client) {
        this.solde = solde;
        this.client = client;
        this.operations =new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "solde=" + solde +
                ", client=" + client +
                ", operations=" + operations +
                '}';
    }
}
