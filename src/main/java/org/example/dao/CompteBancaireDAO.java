package org.example.dao;

import org.example.model.CompteBancaire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CompteBancaireDAO extends BaseDAO<CompteBancaire> {


    public CompteBancaireDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean add(CompteBancaire compte) throws SQLException {


        request = "insert into compteBancaire (solde,client_id)values(?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1,compte.getSolde());
        statement.setInt(2,compte.getClient().getId());
        int nbRows=statement.executeUpdate();
        resultSet=statement.getGeneratedKeys();
        if (resultSet.next()){
            compte.setId(resultSet.getInt(1));
        }

        return nbRows==1;


    }

    @Override
    public boolean update(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(CompteBancaire element) throws SQLException {
        return false;
    }

    @Override
    public CompteBancaire get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<CompteBancaire> get() throws SQLException {
        return null;
    }


}
