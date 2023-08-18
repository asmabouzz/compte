package org.example.dao;

import org.example.model.Operations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class OperationsDAO extends BaseDAO<Operations> {


    public OperationsDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean add(Operations operations) throws SQLException {

        request = "insert into operation (montant,statut)values(?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, operations.getMontant() );
        statement.setString(2,operations.getStatut().name());
        int nbRows=statement.executeUpdate();
        resultSet=statement.getGeneratedKeys();
        if (resultSet.next()){
            operations.setMontant(resultSet.getInt(1));
        }

        return nbRows==1;
    }

    @Override
    public boolean update(Operations element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Operations element) throws SQLException {
        return false;
    }

    @Override
    public Operations get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Operations> get() throws SQLException {
        return null;
    }


}
