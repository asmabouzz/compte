package org.example.service;

import org.example.dao.ClientDAO;
import org.example.dao.CompteBancaireDAO;
import org.example.model.Client;
import org.example.model.CompteBancaire;
import org.example.utile.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class ClientService {

    private ClientDAO clientDAO;
    private CompteBancaireDAO compteBancaireDAO;
    private Connection connection;

    public ClientService() {
        try {
            connection = new DataBaseManager().getConnection();
            clientDAO = new ClientDAO(connection);
            compteBancaireDAO = new CompteBancaireDAO(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean creeClient(String nom, String prenom,String numTel) {
        Client client = new Client(nom, prenom,numTel);
        CompteBancaire compteBancaire=new CompteBancaire(0.0,client);
        try {
            if(clientDAO.add(client)) {
                compteBancaireDAO.add(compteBancaire);
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
