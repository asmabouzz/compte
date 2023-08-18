package org.example.dao;

import org.example.model.Operations;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OperationsDAO extends BaseDAO<Operations> {


    protected OperationsDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean add(Operations element) throws SQLException {
        return false;
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
