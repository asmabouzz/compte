package org.example.service;

import org.example.dao.CompteBancaireDAO;
import org.example.dao.OperationsDAO;
import org.example.utile.DataBaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class OperationsService {
    private OperationsDAO operationsDAO;
    private Connection connection;

    public OperationsService() {
        try {
            connection = new DataBaseManager().getConnection();
            operationsDAO = new OperationsDAO(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
