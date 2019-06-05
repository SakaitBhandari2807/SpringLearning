package org.springframework.chapter5.BatchSpring.JdbcTemplate.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.chapter5.BatchSpring.JdbcTemplate.Model.Employee;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void deleteEmployeeById(int id) {
        String deleteQuery="delete from employee_2 where id=?";
        jdbcTemplate.update(deleteQuery);
    }

    @Override
    public int getEmployeeCount() {
        String sql="select count(*) from employee_2";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    @Override
    public Employee getEmployeeById(int id) {
        String selectQuery="select age,name,id from employee_2 where id=?";
        Employee employee = jdbcTemplate.queryForObject(selectQuery, new Object[]{id}, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee employee = new Employee(rs.getInt("age"),rs.getString("name"),rs.getInt("id"));
                return employee;
            }
        });
        return employee;
    }

    @Override
    public void createEmployee() {
        String createQuery ="create table employee_2 (age integer,name varchar(40),id integer)";
        jdbcTemplate.execute(createQuery);
    }

    @Override
    public void insertEmployees(List<Employee> employees) {
        jdbcTemplate.batchUpdate("Insert into employee_2 (age,name,id) values(?,?,?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setInt(1,employees.get(i).getAge());
                ps.setString(2,employees.get(i).getName());
                ps.setInt(3,employees.get(i).getEmpId());
            }

            @Override
            public int getBatchSize() {
                return employees.size();
            }
        });
    }
}
