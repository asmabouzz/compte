package org.example.service;

import org.example.dao.ClientDAO;
import org.example.dao.CompteBancaireDAO;
import org.example.model.Client;
import org.example.model.CompteBancaire;
import org.example.utile.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class CompteBancaireService {

        private CompteBancaireDAO compteBancaireDAO;
        private Connection connection;

        public CompteBancaireService() {
            try {
                connection = new DataBaseManager().getConnection();
                compteBancaireDAO = new CompteBancaireDAO(connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    public boolean depotArgent(CompteBancaire compteBancaire) {

        try {
            if(compteBancaireDAO.update(compteBancaire)) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }




    }

