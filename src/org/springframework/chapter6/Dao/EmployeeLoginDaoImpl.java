package org.springframework.chapter6.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class EmployeeLoginDaoImpl implements EmployeeLoginDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createEmployee() {

    }
}
