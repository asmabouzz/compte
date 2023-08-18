package org.example.dao;

import org.example.model.Client;
import org.example.model.CompteBancaire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClientDAO extends BaseDAO<Client>{

    public ClientDAO(Connection connection) {
        super(connection);
    }


    @Override
    public boolean add(Client client) throws SQLException {

        request = "insert into client (nom,prenom,num_tel)values(?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, client.getNom() );
        statement.setString(2,client.getPrenom());
        statement.setString(3,client.getNumTel());
        int nbRows=statement.executeUpdate();
        resultSet=statement.getGeneratedKeys();
        if (resultSet.next()){
            client.setId(resultSet.getInt(1));
        }

        return nbRows==1;


    }

    @Override
    public boolean update(Client element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Client element) throws SQLException {
        return false;
    }

    @Override
    public Client get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Client> get() throws SQLException {
        return null;
    }


}
