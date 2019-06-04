package org.springframework.chapter5.JDBC.Dao;

import org.springframework.chapter2.constructioninjection.simplejavatypes.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao{

    private final String DB_URL="jdbc:derby://localhost:1527/db";
    private final String DB_DRIVER="org.apache.derby.jdbc.ClientDriver";

    private void registerDriver(){
        try{
            Class.forName(DB_DRIVER);
        }
        catch(Exception e){
        }
    }

    @Override
    public void createEmployee() {
        Connection conn = null;
        try{
            registerDriver();
            conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();
            stmt.execute("create table employee_1 (id integer,name char(30))");
            stmt.close();
        }
        catch(SQLException e){

        }
        finally {
                if(conn != null){
                    try{
                        conn.close();
                    }
                    catch (SQLException e){
                    }
                }
        }
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public void insertEmployee(Employee employee) {

    }
}



